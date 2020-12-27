package com.newpi.data.singleton;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date 2020/12/27 14:27
 * @desc: 懒汉式单例
 */
public class Singleton02 {

    private static Singleton02 INSTANCE = null;

    private Singleton02(){

    }
    public static Singleton02 getInstance() {
        if(null==INSTANCE){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton02();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {

        for (int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(Singleton02.getInstance());
            }).start();
        }

    }
}
