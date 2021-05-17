package com.newpi.data.creationalPatterns.singleton;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 3:12 PM
 * @desc:
 */
public class SingleTon03 {

    /**
     * 懒汉式单例，懒加载，线程安全,并发访问性能差
     */
    private static SingleTon03 instance = null;

    private SingleTon03() {

    }

    public static synchronized SingleTon03 getInstance() {
        if (null == instance) {
            instance = new SingleTon03();
        }
        return instance;
    }

}
