package com.newpi.data.createtype.builder.model;

import lombok.Data;
import lombok.Setter;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 2:47 PM
 * @desc:
 */
@Setter
public class House {

    private Roof roof;

    private Wall wall;

    private Board board;

    @Override
    public String toString() {
        return "House{" +
                "roof=" + roof +
                ", wall=" + wall +
                ", board=" + board +
                '}';
    }
}
