package com.newpi.data.structionalPatterns.proxy.dynamicproxy;

import com.newpi.data.structionalPatterns.proxy.ConcreateGamePlayer;
import com.newpi.data.structionalPatterns.proxy.IGamePlayer;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/18 11:22 AM
 * @desc:
 */
public class Test {

    public static void main(String[] args) throws Exception {

        IGamePlayer o = (IGamePlayer) MyProxy.newProxyInstance(IGamePlayer.class,
                new TimeHandler(new ConcreateGamePlayer("lisi")));

        o.login();
        o.killBoss();
        o.upgrade();

        IGamePlayer o1 = (IGamePlayer) MyProxy.newProxyInstance(IGamePlayer.class, new LogHandler(o));
        o1.login();
        o1.killBoss();
        o1.upgrade();

    }
}
