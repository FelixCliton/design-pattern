package com.newpi.data.singleton;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date 2020/12/27 14:46
 * @desc:
 */
public class Singleton04 {

    private Singleton04(){}

    private static volatile Singleton04 INSTANCE;

    public static Singleton04 getInstance(){
        if (INSTANCE == null) {
            //试图通过减小同步代码块的方式来解决效率的问题，但是不可行，多线程访问同样不安全
            synchronized (Singleton04.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Singleton04();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {

        for(int i=0;i<100;i++){
            new Thread(()->System.out.println(Singleton04.getInstance())).start();
        }
    }
}
