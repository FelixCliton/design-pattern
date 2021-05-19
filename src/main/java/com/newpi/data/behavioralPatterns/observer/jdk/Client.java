package com.newpi.data.behavioralPatterns.observer.jdk;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 5:52 PM
 * @desc:
 */
public class Client {

    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        publisher.addObserver(new Observer1());
        publisher.addObserver(new Observer2());

        publisher.setData(1);
        publisher.setData(1);
        publisher.setData(1);
        publisher.setData(1);
        publisher.setData(1);
        publisher.setData(1);
    }
}
