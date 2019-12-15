package com.picea.designpatterns.strategy.v02;

import java.util.Arrays;

/**
 * 对象排序，有个排序方法，
 * 调用排序方法，排序完成以后
 *
 * 问题：假如另外一个对象需要排序，在不改变sorter对象的情况下，怎么写？
 *
 * 我们可以定义一个比较的接口Comparable，里面有个compareTo方法，
 * 所有需要比较的类都去实现这个接口
 *
 * 问题：假如我们因为某种原因，排序的算法也需要更新了，如何设计？
 */
public class StrategyMain {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(2,2), new Dog(4,4),new Dog(1,1)};


        Sorter sorter = new Sorter();
        sorter.sort(dogs);

        System.out.println(Arrays.toString(dogs));

        Cat[] cats = {new Cat(3,3), new Cat(2,2),new Cat(1,1)};
        sorter.sort(cats);
        System.out.println(Arrays.toString(cats));
    }
}
