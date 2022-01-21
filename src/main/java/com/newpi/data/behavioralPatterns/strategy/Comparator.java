package com.newpi.data.behavioralPatterns.strategy;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 7:32 PM
 * @desc:
 */
public interface Comparator<T> {

    int compare(T o1, T o2);

}
