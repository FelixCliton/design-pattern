package com.newpi.data.creationalPatterns.singleton;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 3:12 PM
 * @desc:
 */
public class SingleTon04 {

    /**
     * 懒汉式单例，懒加载，线程安全,并发访问性能好
     */
    private static volatile SingleTon04 instance = null;

    private SingleTon04() {

    }

    public static SingleTon04 getInstance() {
        if (null == instance) {
            synchronized (SingleTon04.class) {
                if (null == instance) {
                    instance = new SingleTon04();
                }
            }
        }
        return instance;
    }

}
