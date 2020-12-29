package com.newpi.data.factory.abstractfactory;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2020/12/29 8:04 PM
 * @desc:
 */
public class Main {

    public static void main(String[] args) {

//        AbstractFactory factory = new MagicFactory();
        AbstractFactory factory = new ModernFactory();

        Food food = factory.createFood();
        Vehicle vehicle = factory.createVehicle();
        Weapon weapon = factory.createWeapon();

    }
}
