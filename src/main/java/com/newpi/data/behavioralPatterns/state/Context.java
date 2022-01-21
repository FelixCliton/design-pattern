package com.newpi.data.behavioralPatterns.state;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 6:04 PM
 * @desc:
 */
public  class Context {

    private State currentState;

    private String otherContextInfo;

    public String getOtherContextInfo() {
        return otherContextInfo;
    }

    public void setOtherContextInfo(String otherContextInfo) {
        this.otherContextInfo = otherContextInfo;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void process() {
        if (currentState != null) {
            currentState.handle(this);
        }
    }
}
