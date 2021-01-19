package com.newpi.data.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 8:30 PM
 * @desc:
 */
public class ObjectStructure {

    private List<Employee> employeeList = new ArrayList<Employee>();


    public void addElement(Employee employee) {
        this.employeeList.add(employee);
    }

    public void removeElement(Employee employee) {
        this.employeeList.remove(employee);
    }

    public void accept(Visitor visitor) {
        Iterator<Employee> i = employeeList.iterator();
        while (i.hasNext()) {
            i.next().accept(visitor);
        }
    }

}
