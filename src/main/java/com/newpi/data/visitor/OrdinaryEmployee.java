package com.newpi.data.visitor;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 7:47 PM
 * @desc:
 */
@Data
@Accessors(chain = true)
public class OrdinaryEmployee extends Employee {

    private int workLoad;

    @Override
    void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
