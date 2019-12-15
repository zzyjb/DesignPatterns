package com.picea.designpatterns.strategy.v03;

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
 *
 * 我们可以定义一个Comparator比较器，在排序的时候，同时将比较器传入
 *
 * 因为比较器是我们传入的，所以，我们可以定义很多比较器，可以按高度、重量等分别排序
 */
public class StrategyMain {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(2,2), new Dog(4,4),new Dog(1,1)};
        Sorter<Dog> sorter = new Sorter<>();
        DogComparator dogComparator = new DogComparator();
        sorter.sort(dogs,dogComparator);
        System.out.println(Arrays.toString(dogs));

        Cat[] cats = {new Cat(3,3), new Cat(2,2),new Cat(1,1)};
        Sorter<Cat> sorter2 = new Sorter<>();
        sorter2.sort(cats, new CatComparator());
        System.out.println(Arrays.toString(cats));
    }
}
