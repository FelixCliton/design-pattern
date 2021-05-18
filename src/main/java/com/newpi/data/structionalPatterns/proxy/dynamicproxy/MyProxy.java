package com.newpi.data.structionalPatterns.proxy.dynamicproxy;

import com.newpi.data.structionalPatterns.proxy.ConcreateGamePlayer;
import com.newpi.data.structionalPatterns.proxy.IGamePlayer;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/18 11:14 AM
 * @desc:
 */
public class MyProxy {

    public static Object newProxyInstance() throws IOException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        StringBuilder proxyCLassStringBuilder = new StringBuilder().append("")
                .append("import com.newpi.data.structionalPatterns.proxy.IGamePlayer;").append("\n")
                .append("import java.util.Date;").append("\n")
                .append("\n")
                .append("public class Proxy1 implements IGamePlayer{").append("\n")
                .append("private IGamePlayer player;").append("\n")
                .append("public Proxy1(IGamePlayer player) {this.player = player;}").append("\n")
                .append("@Override\n" +
                        "    public void login() {\n" +
                        "        System.out.println(new Date());\n" +
                        "        player.login();\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void killBoss() {\n" +
                        "        System.out.println(new Date());\n" +
                        "        player.killBoss();\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void upgrade() {\n" +
                        "        System.out.println(new Date());\n" +
                        "        player.upgrade();\n" +
                        "    }\n" +
                        "}");
        System.out.println(proxyCLassStringBuilder.toString());
        File file = new File("./Proxy1.java");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(proxyCLassStringBuilder.toString());
        fileWriter.flush();
        fileWriter.close();

        JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = javaCompiler.getStandardFileManager(null, null, null);
        Iterable<? extends JavaFileObject> javaFileObjects = fileManager.getJavaFileObjects(file);
        JavaCompiler.CompilationTask task = javaCompiler.getTask(null, fileManager, null, null, null, javaFileObjects);
        task.call();
        fileManager.close();
        URL[] urls = new URL[]{new URL("file:////Users/admin/IdeaProjects/design-pattern/")};
        URLClassLoader uc = new URLClassLoader(urls);
        Class c = uc.loadClass("Proxy1");
        Constructor constructor = c.getConstructor(IGamePlayer.class);
        return constructor.newInstance(new ConcreateGamePlayer("zhangsan"));
    }

    //现在动态代理，动态生成的代理类是写死了的，是用字符串写死在类里面的，而且，
    // 只能动态生成实现了 IGamePlayer接口的代理，如果要实现任意接口的代理应该怎么办？
    // 那就不将动态生成代理类的字符串写死，动态拼接生成代理类。
    public static Object newProxyInstance(Class interfaze, InvokeHandler handler) throws Exception {
        String br = "\n";
        StringBuilder proxyCLassStringBuilder = new StringBuilder().append("")
                .append("import ").append(interfaze.getName()).append(";").append("\n")
                .append("import ").append("com.newpi.data.structionalPatterns.proxy.dynamicproxy.InvokeHandler;").append("\n")
                .append("import java.lang.reflect.Method;").append("\n")
                .append("\n")
                .append("public class Proxy1 implements ").append(interfaze.getSimpleName()).append( "{").append("\n")
                .append("private InvokeHandler handler;").append("\n")
                .append("public Proxy1(InvokeHandler handler) {this.handler = handler;}").append("\n");

        Method[] declaredMethods = interfaze.getMethods();
        String methString="";
        for(Method m: declaredMethods){
            methString += "	@Override"+ br +
                    "	public void "+m.getName()+"() {"+ br +
                    "       try {" + br +
                    "       Method md = "+ interfaze.getName()+".class.getMethod(\""+m.getName()+"\");"+ br +
                    "       handler.invoke(this,md);" + br +
                    "       }catch (Exception e){ "+ br+
                    "           e.printStackTrace();" + br +
                    "       }" + br +
                    "	}";
        }
        proxyCLassStringBuilder.append(methString).append(br).append("}");

        System.out.println(proxyCLassStringBuilder.toString());
        File file = new File("./Proxy1.java");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(proxyCLassStringBuilder.toString());
        fileWriter.flush();
        fileWriter.close();

        JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = javaCompiler.getStandardFileManager(null, null, null);
        Iterable<? extends JavaFileObject> javaFileObjects = fileManager.getJavaFileObjects(file);
        JavaCompiler.CompilationTask task = javaCompiler.getTask(null, fileManager, null, null, null, javaFileObjects);
        task.call();
        fileManager.close();
        URL[] urls = new URL[]{new URL("file:////Users/admin/IdeaProjects/design-pattern/")};
        URLClassLoader uc = new URLClassLoader(urls);
        Class c = uc.loadClass("Proxy1");
        Constructor constructor = c.getConstructor(InvokeHandler.class);
        return constructor.newInstance(handler);
    }

}
