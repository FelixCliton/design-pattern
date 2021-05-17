package com.newpi.data.createtype.builder;

import com.newpi.data.createtype.builder.model.Board;
import com.newpi.data.createtype.builder.model.House;
import com.newpi.data.createtype.builder.model.Roof;
import com.newpi.data.createtype.builder.model.Wall;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 2:50 PM
 * @desc:
 */
public class WoodHouseBuilder extends AbstractHoseBuilder{

    @Override
    public House buildRoof() {
        house.setRoof(new Roof());
        System.out.println("wood roof..");
        return house;
    }

    @Override
    public House buildWall() {
        house.setWall(new Wall());
        System.out.println("wood wall..");
        return house;
    }

    @Override
    public House buildBoard() {
        house.setBoard(new Board());
        System.out.println("wood board..");
        return house;
    }
}
