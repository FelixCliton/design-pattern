package com.newpi.data.structionalPatterns.proxy.dynamicproxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/18 2:38 PM
 * @desc:
 */
public interface InvokeHandler {

    void invoke(Object o, Method method) throws InvocationTargetException, IllegalAccessException;

}
