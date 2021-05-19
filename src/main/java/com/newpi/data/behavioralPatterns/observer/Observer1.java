package com.newpi.data.behavioralPatterns.observer;


/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 4:59 PM
 * @desc:
 */
public class Observer1 implements IObserver {
    @Override
    public void notice(State state) {
        System.out.println("observe1 receive notice:" + state);
    }
}
