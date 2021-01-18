package com.newpi.data.proxy;

import com.sun.xml.internal.messaging.saaj.util.CharReader;
import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.util.TraceClassVisitor;

import java.io.*;
import java.lang.reflect.Proxy;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/15 5:36 PM
 * @desc:
 */
public class DynamicProxy {

    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(DynamicProxy.class.getClassLoader(),
                new Class[]{IGamePlayer.class}, new GamePlayHandler(new ConcreateGamePlayer("lisi")));
        proxy.login();
        proxy.killBoss();
        proxy.upgrade();

    }

}
