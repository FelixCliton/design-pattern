package com.newpi.data.factory.simplefactory;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date 2022/1/21 15:35
 * @desc:
 */
public class SimpleFactory {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        IProduct productA = ProductFactory.getInstance(ProductA.class);
        IProduct productB = ProductFactory.getInstance(ProductB.class);
        System.out.println(productA);
        System.out.println(productB);
    }

}
