package com.picea.designpatterns.proxy.v01;

import java.util.Random;

/**
 * 问题1：想记录汽车的移动时间？ 解决方法如下
 * 问题2：如果源代码无法改变如何处理？请查看V02版本
 */
public class Car implements Movable{
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("Car move ..............");
        try {
            Thread.sleep(new Random().nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("time = " +( end - start));
    }

    public static void main(String[] args) {
        new Car().move();
    }
}

interface Movable {
    void move();
}