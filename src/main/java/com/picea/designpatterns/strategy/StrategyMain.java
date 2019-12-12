package com.picea.designpatterns.strategy;

import java.util.Arrays;

public class StrategyMain {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(2,2), new Dog(4,4),new Dog(1,1)};
        Sorter sorter = new Sorter();
        sorter.sort(dogs);
        System.out.println(Arrays.toString(dogs));
    }
}
