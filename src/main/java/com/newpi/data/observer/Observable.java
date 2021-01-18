package com.newpi.data.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 5:01 PM
 * @desc:
 */
public abstract class Observable {

    private List<Observer> observerList = new ArrayList<>();

    public void attachObserver(Observer observer){
        this.observerList.add(observer);
    }

    public void detachObserver(Observer observer){
        this.observerList.remove(observer);
    }

    public void notifyObserver(Event event){
        for (Observer observer : observerList) {
            observer.update(event);
        }
    }
}
