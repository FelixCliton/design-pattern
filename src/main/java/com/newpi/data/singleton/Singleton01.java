package com.newpi.data.singleton;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date 2020/12/27 14:14
 * @desc:
 */
public class Singleton01 {

    private static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01(){
        if (INSTANCE != null) {
            throw new RuntimeException("unsupported operation!");
        }
    }

    public static Singleton01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton01 singleton01 = Singleton01.getInstance();
        Singleton01 singleton02 = Singleton01.getInstance();

        System.out.println(singleton01==singleton02);

    }

}
