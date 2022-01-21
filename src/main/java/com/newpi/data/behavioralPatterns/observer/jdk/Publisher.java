package com.newpi.data.behavioralPatterns.observer.jdk;

import java.util.Observable;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 5:11 PM
 * @desc:
 */
public class Publisher extends Observable {

    private int data;

    public void setData(int data) {
        this.data = data;
        setChanged();
        notifyObservers();
    }
}
