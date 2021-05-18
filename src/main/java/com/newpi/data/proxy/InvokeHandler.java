package com.newpi.data.proxy;

import java.lang.reflect.Method;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/18 2:38 PM
 * @desc:
 */
public interface InvokeHandler  {

    void invoke(Object o, Method method);

}
