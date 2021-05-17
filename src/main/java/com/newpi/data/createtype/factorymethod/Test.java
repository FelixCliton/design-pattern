package com.newpi.data.createtype.factorymethod;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 11:41 AM
 * @desc:
 */
public class Test {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        Movable car = SimpleFactory.createInstance(Car.class);
        car.move();

        car = SimpleFactory.createInstance("car");
        car.move();

        Movable plane = SimpleFactory.createInstance(Plane.class);
        plane.move();

        plane = SimpleFactory.createInstance("plane");
        plane.move();

    }
}
