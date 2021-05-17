package com.newpi.data.creationalPatterns.singleton;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 3:12 PM
 * @desc:
 */
public class SingleTon01 {

    /**
     * 饿汉式单例模式，线程安全，不具备懒加载特性
     */
    private static SingleTon01 instance = new SingleTon01();

    private SingleTon01() {

    }

    public static SingleTon01 getInstance() {
        return instance;
    }

}
