package com.newpi.data.structionalPatterns.proxy.dynamicproxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/18 2:46 PM
 * @desc:
 */
public class TimeHandler implements InvokeHandler {

    private Object target;

    public TimeHandler(Object target){
        super();
        this.target = target;
    }
    @Override
    public void invoke(Object o, Method method) throws InvocationTargetException, IllegalAccessException {
        System.out.println(new Date());
        method.invoke(target);
    }
}
