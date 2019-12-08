package com.picea.designpatterns.proxy.v02;

import java.util.Random;

/**
 * 问题1：想记录坦克的移动时间？ 解决方法01版本
 * 问题2：如果源代码无法改变如何处理？请查看V02版本
 *      初级学者来说，可以使用如下继承的方法，可编码原则告诉我们继承需要少用，耦合度太高
 *      假如记录日志、权限？如何处理？多继承？
 */
public class Car implements Movable {
    @Override
    public void move() {
        System.out.println("Car move ..............");
        try {
            Thread.sleep(new Random().nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Car2().move();
    }
}

class Car2 extends Car {
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        System.out.println("time = " +( end - start));
    }
}

interface Movable {
    void move();
}