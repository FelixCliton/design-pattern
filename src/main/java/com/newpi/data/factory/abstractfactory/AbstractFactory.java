package com.newpi.data.factory.abstractfactory;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2020/12/29 7:46 PM
 * @desc:
 */
public abstract class AbstractFactory {

    abstract Vehicle createVehicle();

    abstract Food createFood();

    abstract Weapon createWeapon();

}
