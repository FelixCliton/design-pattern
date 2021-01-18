package com.newpi.data.state;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 10:20 AM
 * @desc:
 */
public class ScaleStartState<T> extends TaskState {

    @Override
    protected T process(Context context) {
        System.out.println("start scale down old app....");
        context.setNextState(Context.OLD_APP_SCALE_DOWN_START);
        return null;
    }
    @Override
    protected void setNextState(Context context) {
        context.setNextState(Context.OLD_APP_SCALE_DOWN_START);
    }
}
