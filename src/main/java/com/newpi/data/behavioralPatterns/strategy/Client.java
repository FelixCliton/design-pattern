package com.newpi.data.behavioralPatterns.strategy;

import com.newpi.data.behavioralPatterns.state.Context;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 7:35 PM
 * @desc:
 */
public class Client {

    public static void main(String[] args) {

        Cat cat1 = new Cat(10,2);
        Cat cat2 = new Cat(9,3);

        Comparator comparator = new CatAgeComparator();
        System.out.println(comparator.compare(cat1,cat2));

        comparator = new CatWeightComparator();
        System.out.println(comparator.compare(cat1,cat2));


        System.out.println("======================================");
        System.out.println("======================================");

        StrategyContext context = new StrategyContext();
        context.setContextInfo("不同策略输出形式不一样～");

        IStrategy strategy1 = new ConcreteStrategy1();
        context.setStrategy(strategy1);
        context.process();

        System.out.println();
        IStrategy strategy2 = new ConcreteStrategy2();
        context.setStrategy(strategy2);
        context.process();
    }

}
