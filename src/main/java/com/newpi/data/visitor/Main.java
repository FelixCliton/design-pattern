package com.newpi.data.visitor;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 7:50 PM
 * @desc:
 */
public class Main {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.addElement(new Manager().setPerformanceEvaluation("A").setName("manager A"));
        os.addElement(new OrdinaryEmployee().setWorkLoad(10).setName("worker 1"));
        os.addElement(new OrdinaryEmployee().setWorkLoad(20).setName("worker 2"));
        os.addElement(new OrdinaryEmployee().setWorkLoad(30).setName("worker 3"));
        os.addElement(new OrdinaryEmployee().setWorkLoad(10).setName("worker 4"));
        os.addElement(new Manager().setPerformanceEvaluation("B").setName("manager B"));

        Visitor visitor = new ManagerVisitor();
        os.accept(visitor);
        System.out.println("------------------------");
        visitor = new OrdinaryEmployeeVisitor();
        os.accept(visitor);
    }

}
