package com.newpi.data.behavioralPatterns.template_method;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 8:04 PM
 * @desc:
 */
public class App2 extends AbstractApp {
    @Override
    public void loadData() {
        System.out.println("load data from excel");
    }

    @Override
    public void formatData() {
        System.out.println("format data as xml");
    }

    @Override
    public void doProcess() {
        System.out.println("process xml data");
    }

    @Override
    public void beforeShutDown() {
        System.out.println("the person in charge not concern, don't send message,just shutdown");
    }
}
