package com.newpi.data.state;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 10:20 AM
 * @desc:
 */
public class ScaleFinishedState<T> extends TaskState {

    @Override
    protected T process(Context context) {
        System.out.println("scale finished");
        return null;
    }
    @Override
    protected void setNextState(Context context) {

    }
}
