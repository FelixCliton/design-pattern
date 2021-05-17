package com.newpi.data.createtype.abstractfactory;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 2:09 PM
 * @desc:
 */
public class Test {

    public static void main(String[] args) {
        IFactory factory = new HuaweiFactory();

        factory.createComputer();
        factory.createMouse();
        factory.createKeyBoard();
        System.out.println("切换工厂===========================");
        factory = new XiaomiFactory();
        factory.createComputer();
        factory.createMouse();
        factory.createKeyBoard();
    }
}

