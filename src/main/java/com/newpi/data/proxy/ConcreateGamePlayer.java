package com.newpi.data.proxy;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/15 5:26 PM
 * @desc:
 */
public class ConcreateGamePlayer implements IGamePlayer {

    private String user;

    public ConcreateGamePlayer(String user) {
        this.user = user;
    }


    @Override
    public void login() {
        System.out.println(user + " login");
    }

    @Override
    public void killBoss() {
        System.out.println(user + " kill Boss");
    }

    @Override
    public void upgrade() {
        System.out.println(user + " upgrade");
    }
}
