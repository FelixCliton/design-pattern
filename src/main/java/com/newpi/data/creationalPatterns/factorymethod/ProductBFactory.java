package com.newpi.data.creationalPatterns.factorymethod;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date 2022/1/21 16:03
 * @desc:
 */
public class ProductBFactory implements IFactory {
    @Override
    public IProduct createProduct() {
        System.out.println("crate product B");
        return new ProductB();
    }
}
