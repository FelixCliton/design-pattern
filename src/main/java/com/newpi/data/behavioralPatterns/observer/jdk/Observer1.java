package com.newpi.data.behavioralPatterns.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 5:12 PM
 * @desc:
 */
public class Observer1 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o.getClass());
    }
}
