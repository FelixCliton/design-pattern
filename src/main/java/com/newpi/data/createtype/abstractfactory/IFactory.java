package com.newpi.data.createtype.abstractfactory;

import com.newpi.data.createtype.abstractfactory.model.Computer;
import com.newpi.data.createtype.abstractfactory.model.Keyboard;
import com.newpi.data.createtype.abstractfactory.model.Mouse;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 11:44 AM
 * @desc:
 */
public interface IFactory {

    public Computer createComputer();

    public Mouse createMouse();

    public Keyboard createKeyBoard();

}
