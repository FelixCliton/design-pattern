package com.newpi.data.structionalPatterns.adapter;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/18 10:38 AM
 * @desc:
 */
public class Test {

    public static void main(String[] args) {

        MyPartDataInterface dataInterface = new MyService();
        System.out.println("================= my data structure");
        System.out.println(dataInterface.processData());
        System.out.println();

        ThirdPartyDadaInterface thirdPartyDadaInterface = new ThirdPartService();
        System.out.println("================= third part data structure");
        System.out.println(thirdPartyDadaInterface.fetchData());
        System.out.println();

        dataInterface = new Adapter();
        System.out.println("================= adapted data structure");
        System.out.println(dataInterface.processData());


    }

}
