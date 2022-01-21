package com.newpi.data.behavioralPatterns.state;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 6:09 PM
 * @desc:
 */
public class Client {

    public static void main(String[] args) {

        Context context = new Context();
        context.setCurrentState(new State1());
        context.process();

        context.setCurrentState(new State2());
        context.process();

    }

}
