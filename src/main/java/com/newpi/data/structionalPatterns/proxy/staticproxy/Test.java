package com.newpi.data.structionalPatterns.proxy.staticproxy;

import com.newpi.data.structionalPatterns.proxy.ConcreateGamePlayer;
import com.newpi.data.structionalPatterns.proxy.IGamePlayer;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/15 5:33 PM
 * @desc:
 */
public class Test {

    public static void main(String[] args) {

        IGamePlayer player = new ConcreateGamePlayer("zhangsan");

        IGamePlayer proxy = new StaticProxy(player);

        proxy.login();
        proxy.killBoss();
        proxy.upgrade();
    }
}
