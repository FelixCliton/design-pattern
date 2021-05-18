package com.newpi.data.structionalPatterns.proxy.staticproxy;

import com.newpi.data.structionalPatterns.proxy.IGamePlayer;

import java.util.Date;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/15 5:25 PM
 * @desc:
 */
public class StaticProxy implements IGamePlayer {

    private IGamePlayer player;

    public StaticProxy(IGamePlayer player) {
        this.player = player;
    }

    @Override
    public void login() {
        System.out.println(new Date());
        player.login();
    }

    @Override
    public void killBoss() {
        System.out.println(new Date());
        player.killBoss();
    }

    @Override
    public void upgrade() {
        System.out.println(new Date());
        player.upgrade();
    }
}
