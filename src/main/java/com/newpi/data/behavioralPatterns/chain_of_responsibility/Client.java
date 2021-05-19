package com.newpi.data.behavioralPatterns.chain_of_responsibility;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 4:41 PM
 * @desc:
 */
public class Client {

    public static void main(String[] args) {

        IHandler handler1 = new Handler1();
        IHandler handler2 = new Handler2();
        IHandler handler3 = new Handler3();
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        handler1.handle("request");
    }

}
