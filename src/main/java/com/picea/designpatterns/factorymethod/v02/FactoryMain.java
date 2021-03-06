package com.picea.designpatterns.factorymethod.v02;

/**
 * 交通工具举例
 * 假如我们想坐飞机、坐汽车？如何设计？
 *
 * new 一个我们想要的工具，就可以实现
 *问题：主代码每次需要知道我们new的新对象是谁，能否找一个通用对象？
 *
 * 我们定义一个Moveable接口，每个对象都实现这个接口，那么在主方法中，使用Moveable即可
 *
 * 问题：假如我们的new对象的过程也需要管理？如何处理
 */
public class FactoryMain {

    public static void main(String[] args) {
        Moveable m = new Car();
        m.go();

        Moveable m2 = new Plane();
        m2.go();
    }
}
