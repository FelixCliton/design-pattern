package com.newpi.data.behavioralPatterns.observer;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 4:52 PM
 * @desc:
 */
public class Publisher {

    private List<IObserver> observerList = new CopyOnWriteArrayList<>();

    private State currentState;

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        notifyAllObserver();
    }

    public void addObserver(IObserver observer){
        this.observerList.add(observer);
    }

    public void removeObserver(IObserver observer){
        this.observerList.remove(observer);
    }

    private void notifyAllObserver(){
        for (IObserver observer : observerList) {
            observer.notice(currentState);
        }
    }
}
