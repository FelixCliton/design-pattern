package com.newpi.data.behavioralPatterns.template_method;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 8:04 PM
 * @desc:
 */
public class App1 extends AbstractApp {
    @Override
    public void loadData() {
        System.out.println("load data from database");
    }

    @Override
    public void formatData() {
        System.out.println("format data as json");
    }

    @Override
    public void doProcess() {
        System.out.println("process json data");
    }

    @Override
    public void beforeShutDown() {
        System.out.println("before app shutdown, send a message to the person in charge");
    }
}
