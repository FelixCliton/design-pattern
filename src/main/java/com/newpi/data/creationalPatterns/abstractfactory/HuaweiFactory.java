package com.newpi.data.creationalPatterns.abstractfactory;

import com.newpi.data.creationalPatterns.abstractfactory.model.Computer;
import com.newpi.data.creationalPatterns.abstractfactory.model.Keyboard;
import com.newpi.data.creationalPatterns.abstractfactory.model.Mouse;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 2:07 PM
 * @desc:
 */
public class HuaweiFactory implements IFactory {
    @Override
    public Computer createComputer() {
        System.out.println("华为电脑");
        return new Computer();
    }

    @Override
    public Mouse createMouse() {
        System.out.println("华为鼠标");
        return new Mouse();
    }

    @Override
    public Keyboard createKeyBoard() {
        System.out.println("华为键盘");
        return new Keyboard();
    }
}
