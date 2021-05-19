package com.newpi.data.behavioralPatterns.state;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 6:08 PM
 * @desc:
 */
public class State1 implements State {


    @Override
    public void handle(Context context) {
        System.out.println("state1, do nothing");
    }
}
