package com.newpi.data.observer;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 5:19 PM
 * @desc:
 */
public class Main {


    public static void main(String[] args) throws InterruptedException {

        BossMonitor bossMonitor = new BossMonitor();
        bossMonitor.attachObserver(new ZhangsanObserver());
        bossMonitor.attachObserver(new LisiObserver());

        bossMonitor.monitorBoss();


    }

}
