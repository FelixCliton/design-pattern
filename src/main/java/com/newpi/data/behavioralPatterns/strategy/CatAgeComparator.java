package com.newpi.data.behavioralPatterns.strategy;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 7:33 PM
 * @desc:
 */
public class CatAgeComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getAge() - o2.getAge();
    }
}
