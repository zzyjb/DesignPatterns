package com.picea.designpatterns.factorymethod.v01;

/**
 * 交通工具举例
 * 假如我们想坐飞机、坐汽车？如何设计？
 *
 * new 一个我们想要的工具，就可以实现
 *问题：主代码每次需要知道我们new的新对象是谁，能否找一个通用对象？
 */
public class FactoryMain {

    public static void main(String[] args) {
        Car car = new Car();
        car.go();

        Plane plane = new Plane();
        plane.go();
    }
}
