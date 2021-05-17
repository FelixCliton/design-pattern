package com.newpi.data.creationalPatterns.singleton;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 3:12 PM
 * @desc:
 */
public class SingleTon05 {

    /**
     * 懒汉式单例，懒加载，线程安全,并发访问性能好
     */
    private SingleTon05() {
    }

    public static SingleTon05 getInstance() {

        return SingleTonHolder.INSTANCE;
    }

    private static class SingleTonHolder {
        private static SingleTon05 INSTANCE = new SingleTon05();
    }
}
