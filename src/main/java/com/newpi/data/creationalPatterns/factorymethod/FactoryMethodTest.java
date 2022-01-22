package com.newpi.data.creationalPatterns.factorymethod;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date 2022/1/21 16:05
 * @desc:
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        IProduct productA = new ProductAFactory().createProduct();
        System.out.println(productA);

        IProduct productB = new ProductBFactory().createProduct();
        System.out.println(productB);
    }
}
