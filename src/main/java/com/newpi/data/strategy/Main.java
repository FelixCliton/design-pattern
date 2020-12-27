package com.newpi.data.strategy;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date 2020/12/27 20:50
 * @desc:
 */
public class Main {

    public static void main(String[] args) {
        Cat[] array = new Cat[]{};

        Sorter<Cat> sorter = new Sorter<Cat>();
        sorter.sort(array, new MyComparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return 0;
            }
        });
        for (Cat i : array) {
            System.out.print(i+" ");
        }
    }

}
