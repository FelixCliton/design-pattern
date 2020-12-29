package com.newpi.data.factory.factorymethod;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2020/12/29 7:36 PM
 * @desc:
 */
public class Car implements Movable {
    @Override
    public void move() {
        System.out.println("car move....");
    }
}
