package com.newpi.data.state;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 10:08 AM
 * @desc:
 */
public abstract class TaskState<T> {

    protected T handle(Context context) {
        T t = process(context);
        setNextState(context);
        return t;
    }

    protected abstract T process(Context context);

    protected abstract void setNextState(Context context);
}
