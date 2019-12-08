package com.picea.designpatterns.proxy.v06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
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
 *      这个需求很正常，可以使用JDK的动态代理来实现，分离代理和被代理类
 *      JDK动态代理，只能代理实现了接口的方法
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
        Car car = new Car();
        /**
         * 1. 类加载器，一般是被代理对象的类加载器。可以是父类的类加载器，但是不能是平行的类加载器
         * 2. 必须要实现接口。
         * 3. 第三个参数是调用那个类处理被代理的类方法。
         */
        Movable movable = (Movable) Proxy.newProxyInstance(Car.class.getClassLoader(),
                new Class[] {Movable.class},
//                //实现方法1，函数式方法
//                new InvocationHandler() {
//                    @Override
//                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("method "+ method.getName()+" start ....");
//                        Object o = method.invoke(car, args);
//                        System.out.println("method " + method.getName() + " end ");
//                        return o;
//                    }
//              }
                //方法2：
                new LogHander(car)
                );
        movable.move();
    }
}

class LogHander implements  InvocationHandler {

    Car car;

    public LogHander(Car car) {
        this.car = car;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method "+ method.getName()+" start ....");
        Object o = method.invoke(car, args);
        System.out.println("method " + method.getName() + " end ");
        return o;
    }
}

interface Movable {
    void move();
}