package com.newpi.data.factory.abstractfactory;

import com.newpi.data.factory.factorymethod.Movable;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2020/12/29 7:36 PM
 * @desc:
 */
public class Plane implements Movable {
    @Override
    public void move() {
        System.out.println("plane move.....");
    }
}
