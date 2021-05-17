package com.newpi.data.createtype.singleton;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 3:24 PM
 * @desc:
 */
public enum SingleTon06 {

    INSTANCE;

    /**
     * 线程安全，非懒加载特性，并发访问性能好
     *
     * @return
     */
    public static SingleTon06 getInstance() {
        return INSTANCE;
    }

}
