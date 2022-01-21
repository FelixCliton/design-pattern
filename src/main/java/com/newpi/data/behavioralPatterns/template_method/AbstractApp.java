package com.newpi.data.behavioralPatterns.template_method;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 7:59 PM
 * @desc:
 */
public abstract class AbstractApp {

    public void startApp() {
        loadData();
        formatData();
        doProcess();
        shutdown();
    }

    protected abstract void loadData();

    protected abstract void formatData();

    protected abstract void doProcess();

    private void shutdown() {
        System.out.println("call shut down method...");
        beforeShutDown();
        System.out.println("app shutdown");
    }

    protected abstract void beforeShutDown();

}
