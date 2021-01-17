package com.newpi.data.proxy;

import java.lang.reflect.InvocationHandler;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/15 8:19 PM
 * @desc:
 */
public class DynamicProxyGenerator {


   public static Object generateProxy(Class clzz, InvocationHandler handler) throws ClassNotFoundException, IllegalAccessException, InstantiationException {


       Class[] interfaces = clzz.getInterfaces();

       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append("package ").append(clzz.getPackage().getName()).append(";\n");

       stringBuilder.append("import ").append(InvocationHandler.class.getName()).append(";\n");
       stringBuilder.append("public class ").append(clzz.getName()).append("$0{\n}");

       System.out.println(stringBuilder.toString());

       ClassLoader classLoader = clzz.getClassLoader();
       Class<?> aClass = clzz.getClassLoader().loadClass(clzz.getName() + "$0");

       Object o = aClass.newInstance();

       return null;

   }

}
