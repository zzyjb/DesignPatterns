package com.picea.designpatterns.proxy.v05;

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
 *      将代理对象修改为Movable，这个多个代理之间可以嵌套使用，越来越像decorator？
 *      new CarLogProxy(
 *                 new CarTimeProxy(
 *                         new Car()
 *                 )
 *         ).move();
 * 问题5：如果我想让CarLogProxy可以代理任何其他可以代理的类型Object，如何处理？
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
        new CarLogProxy(
                new CarTimeProxy(
                        new Car()
                )
        ).move();
    }
}

class CarTimeProxy implements Movable {

    Movable movable;

    CarTimeProxy(Movable movable) {
        this.movable =movable;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        movable.move();
        long end = System.currentTimeMillis();
        System.out.println("time = " +( end - start));
    }
}

class CarLogProxy implements Movable {

    Movable movable;

    CarLogProxy(Movable movable) {
        this.movable =movable;
    }

    @Override
    public void move() {
        System.out.println("move start");
        movable.move();
        System.out.println("end");
    }
}

interface Movable {
    void move();
}