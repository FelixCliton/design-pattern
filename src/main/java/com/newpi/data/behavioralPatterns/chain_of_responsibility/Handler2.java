package com.newpi.data.behavioralPatterns.chain_of_responsibility;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 4:40 PM
 * @desc:
 */
public class Handler2 extends BaseHandler {
    @Override
    protected void invoke() {
        System.out.println("handler 2 process.....");
    }

    @Override
    protected boolean canHandle(String request) {
        return true;
    }
}
