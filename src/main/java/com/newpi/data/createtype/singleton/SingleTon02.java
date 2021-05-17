package com.newpi.data.createtype.singleton;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 3:12 PM
 * @desc:
 */
public class SingleTon02 {

    /**
     * 懒汉式单例，懒加载，线程不安全
     */
    private static SingleTon02 instance = null;

    private SingleTon02() {

    }

    public static SingleTon02 getInstance() {
        if (null == instance) {
            instance = new SingleTon02();
        }
        return instance;
    }

}
