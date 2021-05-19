package com.newpi.data.behavioralPatterns.chain_of_responsibility;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 4:34 PM
 * @desc:
 */
public interface IHandler {

    void setNextHandler(IHandler nextHandler);


    void handle(String request);

}
