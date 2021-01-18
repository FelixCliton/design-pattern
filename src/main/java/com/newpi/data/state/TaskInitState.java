package com.newpi.data.state;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 10:20 AM
 * @desc:
 */
public class TaskInitState<T> extends TaskState {

    @Override
    protected T process(Context context) {
        System.out.println("resource is enough, allow start scale operator.");
        return null;
    }

    @Override
    protected void setNextState(Context context) {
        System.out.println(this.getClass().getName());
        context.setNextState(Context.SCALE_START);
    }

}
