package com.newpi.data.singleton;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date 2020/12/27 14:46
 * @desc:
 */
public enum  Singleton07 {

    INSTANCE;

    public static void main(String[] args) {

        for(int i=0;i<100;i++){
            new Thread(()->System.out.println(Singleton07.INSTANCE.hashCode())).start();
        }
    }
}
