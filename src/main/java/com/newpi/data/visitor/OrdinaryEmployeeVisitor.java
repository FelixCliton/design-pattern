package com.newpi.data.visitor;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 8:49 PM
 * @desc:
 */
public class OrdinaryEmployeeVisitor implements Visitor {
    @Override
    public void visitor(Manager manager) {

    }

    @Override
    public void visitor(OrdinaryEmployee employee) {
        System.out.println(employee.getName() + "\t" + employee.getWorkLoad());
    }
}
