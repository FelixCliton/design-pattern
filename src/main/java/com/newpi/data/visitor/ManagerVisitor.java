package com.newpi.data.visitor;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 8:00 PM
 * @desc:
 */
public class ManagerVisitor implements Visitor {

    @Override
    public void visitor(Manager manager) {
        System.out.println(manager.getName() + "\t" + manager.getPerformanceEvaluation());
    }

    @Override
    public void visitor(OrdinaryEmployee employee) {

    }
}
