package com.newpi.data.behavioralPatterns.template_method;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 8:08 PM
 * @desc:
 */
public class Client {

    public static void main(String[] args) {

        AbstractApp app1 = new App1();
        app1.startApp();

        System.out.println();
        System.out.println("=========================");
        System.out.println();

        AbstractApp app2 = new App2();
        app2.startApp();

    }

}
