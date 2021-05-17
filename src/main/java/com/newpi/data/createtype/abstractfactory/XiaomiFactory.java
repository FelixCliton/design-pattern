package com.newpi.data.createtype.abstractfactory;

import com.newpi.data.createtype.abstractfactory.model.Computer;
import com.newpi.data.createtype.abstractfactory.model.Keyboard;
import com.newpi.data.createtype.abstractfactory.model.Mouse;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 2:07 PM
 * @desc:
 */
public class XiaomiFactory implements IFactory {
    @Override
    public Computer createComputer() {
        System.out.println("小米电脑");
        return new Computer();
    }

    @Override
    public Mouse createMouse() {
        System.out.println("小米鼠标");
        return new Mouse();
    }

    @Override
    public Keyboard createKeyBoard() {
        System.out.println("小米键盘");
        return new Keyboard();
    }
}
