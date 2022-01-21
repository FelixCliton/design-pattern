package com.newpi.data.behavioralPatterns.strategy;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 7:45 PM
 * @desc:
 */
public class ConcreteStrategy2 implements IStrategy {

    @Override
    public void execProcess(StrategyContext context) {
        System.out.println("strategy 2");
        System.out.println(context.getContextInfo());
        System.out.println("====================");
    }

}
