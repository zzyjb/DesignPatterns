package com.picea.designpatterns.strategy.v01;

import java.util.Arrays;

/**
 * 对象排序，有个排序方法，
 * 调用排序方法，排序完成以后
 *
 * 问题：假如另外一个对象需要排序，在不改变sorter对象的情况下，怎么写？
 */
public class StrategyMain {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(2,2), new Dog(4,4),new Dog(1,1)};
        Sorter sorter = new Sorter();
        sorter.sort(dogs);
        System.out.println(Arrays.toString(dogs));
    }
}
