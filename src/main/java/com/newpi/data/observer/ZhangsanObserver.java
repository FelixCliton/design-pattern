package com.newpi.data.observer;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 5:17 PM
 * @desc:
 */
public class ZhangsanObserver implements Observer {
    @Override
    public void update(Event event) {
        System.out.println("my name is zhangsan,I get the message of :" + event.getMessage());
        System.out.println("working....");
    }
}
