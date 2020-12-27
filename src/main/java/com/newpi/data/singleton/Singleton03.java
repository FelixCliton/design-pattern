package com.newpi.data.singleton;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date 2020/12/27 14:46
 * @desc:
 */
public class Singleton03 {

    private Singleton03(){}

    private static volatile Singleton03 INSTANCE;

    public synchronized static Singleton03 getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {

        for(int i=0;i<100;i++){
            new Thread(()->System.out.println(Singleton03.getInstance())).start();
        }
    }
}
