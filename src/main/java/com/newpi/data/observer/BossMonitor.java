package com.newpi.data.observer;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 5:11 PM
 * @desc:
 */
public class BossMonitor extends Observable {


    public void monitorBoss() throws InterruptedException {

        System.out.println("start monitor boss action...");

        System.out.println("boss  is coming...");

        Event event = new Event();
        event.setMessage("boss is coming");

        notifyObserver(event);

        Thread.sleep(1000);
        event.setMessage("boss leaved.");

        notifyObserver(event);
    }



}
