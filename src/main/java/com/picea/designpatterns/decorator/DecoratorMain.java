package com.picea.designpatterns.decorator;

/**
 * Decorator 装饰器模式
 *车辆，本身是红色的，现在我们想加上蓝色、黑色的线条，怎么处理？
 *
 * 首先把车辆抽象出一个基础抽象类 VehicleObject （或者接口）里面本身有颜色方法
 *
 * 然后定义Decorator 抽象类，里面必须有个private的基础抽象类 VehicleObject
 *
 * 然后定义真实的 BlackDecorator 继承Decorator 抽象类，重新父类的方法，加上我们想要的线条
 */
public class DecoratorMain {

    public static void main(String[] args) {
        VehicleObject v = new Car();
        //第一次调用装饰器 ，加上blue 颜色
        v = new BlueDecorator(v);
        //第二次调用装饰器，加上 black 颜色
        v = new BlackDecorator(v);
        //调用方法
        v.colour();
    }
}
