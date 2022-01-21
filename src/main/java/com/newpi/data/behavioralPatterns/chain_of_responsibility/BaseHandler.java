package com.newpi.data.behavioralPatterns.chain_of_responsibility;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 4:37 PM
 * @desc:
 */
public abstract class BaseHandler implements IHandler {

    private IHandler nextHandler;

    @Override
    public void setNextHandler(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(String request) {
        if (canHandle(request)) {
            invoke();
        } else {
            if (nextHandler != null) {
                nextHandler.handle(request);
            }
        }
    }

    protected abstract void invoke();

    protected abstract boolean canHandle(String request);
}
