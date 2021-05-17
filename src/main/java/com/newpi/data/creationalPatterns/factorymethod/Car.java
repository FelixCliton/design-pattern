package com.newpi.data.creationalPatterns.factorymethod;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 11:36 AM
 * @desc:
 */
public class Car implements Movable {
    @Override
    public void move() {
        System.out.println("car move ....");
    }
}
