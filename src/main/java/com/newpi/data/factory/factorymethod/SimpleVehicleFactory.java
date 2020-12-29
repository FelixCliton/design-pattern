package com.newpi.data.factory.factorymethod;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2020/12/29 7:34 PM
 * @desc:
 */

public class SimpleVehicleFactory {

    /**
     *
     * @return
     */

    public Car createCar() {
        //before process
        return new Car();
    }


    Plane createPlane(){
        //before process
        return new Plane();
    }
}
