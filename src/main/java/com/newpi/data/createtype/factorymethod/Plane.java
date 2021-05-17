package com.newpi.data.createtype.factorymethod;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 11:37 AM
 * @desc:
 */
public class Plane implements Movable {

    @Override
    public void move() {
        System.out.println("plane fly...");
    }
}
