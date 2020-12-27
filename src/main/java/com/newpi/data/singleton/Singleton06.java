package com.newpi.data.singleton;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date 2020/12/27 14:46
 * @desc:
 */
public class Singleton06 {

    private Singleton06(){}

    public static Singleton06 getInstance(){
      return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {

        for(int i=0;i<100;i++){
            new Thread(()->System.out.println(Singleton06.getInstance())).start();
        }
    }

    private static class SingletonHolder{
        private static Singleton06 INSTANCE = new Singleton06();
    }
}
