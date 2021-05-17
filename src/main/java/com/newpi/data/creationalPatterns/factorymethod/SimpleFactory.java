package com.newpi.data.creationalPatterns.factorymethod;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 11:34 AM
 * @desc:
 */
public class SimpleFactory {

    public static Movable createInstance(Class clzz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        return (Movable) Class.forName(clzz.getName()).newInstance();

    }

    public static Movable createInstance(String type) {

        if (type.equals("car")) {
            return new Car();
        }
        if (type.equals("plane")) {
            return new Plane();
        }
        return null;
    }
}
