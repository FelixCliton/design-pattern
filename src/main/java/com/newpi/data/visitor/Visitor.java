package com.newpi.data.visitor;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 7:57 PM
 * @desc:
 */
public interface Visitor {

    void visitor(Manager manager);

    void visitor(OrdinaryEmployee employee);

}
