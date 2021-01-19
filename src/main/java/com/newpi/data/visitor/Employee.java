package com.newpi.data.visitor;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 7:45 PM
 * @desc:
 */
@Data
@Accessors(chain = true)
public abstract class Employee {

    private String name;

    private Float salary;

    private int age;

    private String job;

    abstract void accept(Visitor visitor);

}
