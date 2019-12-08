package com.picea.designpatterns.proxy.v04;

import java.util.Random;

/**
 * 问题1：想记录坦克的移动时间？ 解决方法01版本
 * 问题2：如果源代码无法改变如何处理？请查看V02版本
 *      初级学者来说，可以使用如下继承的方法，可编码原则告诉我们继承需要少用，耦合度太高
 *      假如记录日志、权限？如何处理？多继承？
 *
 *      使用静态代理,CarTimeProxy来代理Car。
 *
 * 问题3：多种代理实现方法？ 可以多个代理模式
 * 问题4：如何实现代理的组合？
 *
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
        new CarTimeProxy(new Car()).move();
        new CarLogProxy(new Car()).move();
    }
}

class CarTimeProxy implements Movable {

    Car car;

    CarTimeProxy(Car car) {
        this.car =car;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        car.move();
        long end = System.currentTimeMillis();
        System.out.println("time = " +( end - start));
    }
}

class CarLogProxy implements Movable {

    Car car;

    CarLogProxy(Car car) {
        this.car =car;
    }

    @Override
    public void move() {
        System.out.println("move start");
        car.move();
        System.out.println("end");
    }
}

interface Movable {
    void move();
}