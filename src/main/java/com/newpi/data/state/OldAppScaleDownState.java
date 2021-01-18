package com.newpi.data.state;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 10:20 AM
 * @desc:
 */
public class OldAppScaleDownState<T> extends TaskState {

    @Override
    protected T process(Context context) {
        System.out.println("old app scale down finished,start scale up new App");

        return null;
    }
    @Override
    protected void setNextState(Context context) {
        context.setNextState(Context.new_APP_SCALE_UP_START);
    }
}
