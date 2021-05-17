package com.newpi.data.creationalPatterns.builder;

import com.newpi.data.creationalPatterns.builder.model.House;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 2:57 PM
 * @desc:
 */
public class Test {

    public static void main(String[] args) {

        AbstractHoseBuilder hoseBuilder = new WoodHouseBuilder();
        hoseBuilder.buildRoof();
        hoseBuilder.buildWall();
        hoseBuilder.buildBoard();
        House house = hoseBuilder.getHouse();
        System.out.println(house.toString());

    }

}
