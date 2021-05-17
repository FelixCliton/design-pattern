package com.newpi.data.creationalPatterns.builder;

import com.newpi.data.creationalPatterns.builder.model.House;
import lombok.Data;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/17 2:47 PM
 * @desc:
 */
@Data
public abstract class AbstractHoseBuilder {

    protected House house = new House();

    abstract House buildRoof();

    abstract House buildWall();

    abstract House buildBoard();

}
