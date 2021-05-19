package com.newpi.data.behavioralPatterns.observer;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 5:02 PM
 * @desc:
 */
public class Client {

    public static void main(String[] args) {

        Publisher publisher = new Publisher();
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        publisher.addObserver(observer1);
        publisher.addObserver(observer2);

        publisher.setCurrentState(State.STATE1);
        publisher.setCurrentState(State.STATE2);
    }

}
