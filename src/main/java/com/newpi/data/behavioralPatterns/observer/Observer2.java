package com.newpi.data.behavioralPatterns.observer;


/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 4:59 PM
 * @desc:
 */
public class Observer2 implements IObserver {
    @Override
    public void notice(State state) {
        System.out.println("observe2 receive notice:" + state);
    }
}
