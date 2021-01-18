package com.newpi.data.state;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 10:26 AM
 * @desc:
 */
public class Main {

    public static void main(String[] args) {

        Task task = new Task();
        task.setNewApp("new app");
        task.setOldApp("old App");

        Context context = new Context();
        context.setNextState(Context.TASK_INIT);
        context.handle();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }

}
