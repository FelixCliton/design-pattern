package com.newpi.data.factory.simplefactory;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date 2022/1/21 15:37
 * @desc:
 */
public class ProductFactory {

    public static IProduct getInstance(Class<? extends IProduct> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }

}
