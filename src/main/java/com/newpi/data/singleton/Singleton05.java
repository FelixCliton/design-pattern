package com.newpi.data.singleton;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date 2020/12/27 14:46
 * @desc:
 */
public class Singleton05 {

    private Singleton05(){}

    private static volatile Singleton05 INSTANCE;

    public static Singleton05 getInstance(){
        if (INSTANCE == null) {
            //双重检查锁
            synchronized (Singleton05.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Singleton05();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {

        for(int i=0;i<100;i++){
            new Thread(()->System.out.println(Singleton05.getInstance())).start();
        }
    }
}
