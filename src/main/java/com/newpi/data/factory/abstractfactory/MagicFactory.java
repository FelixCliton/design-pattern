package com.newpi.data.factory.abstractfactory;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2020/12/29 8:01 PM
 * @desc:
 */
public class MagicFactory extends AbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    public Food createFood() {
        return new MuchRoom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStack();
    }
}
