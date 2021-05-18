package com.newpi.data.proxy;

import com.newpi.data.structionalPatterns.proxy.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/15 5:41 PM
 * @desc:
 */
public class GamePlayHandler implements InvocationHandler {

    private IGamePlayer player;

    public GamePlayHandler(IGamePlayer player) {
        this.player = player;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(new Date());
        return method.invoke(player, args);
    }
}
