package com.newpi.data.factory.factorymethod;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2020/12/29 7:41 PM
 * @desc:
 */
public class CarFactory {

     public Movable create(){
         System.out.println("a car created!");
         return new Car();
     }
}
