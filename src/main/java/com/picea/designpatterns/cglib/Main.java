package com.picea.designpatterns.cglib;



import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * cglib 不能实现 final类
 * JDK动态代理、cglib代理、Spring的代理，都是用ASM实现的
 * ASM可以实现
 *
 */
public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Car.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        Car car = (Car) enhancer.create();
        car.move();
    }
}

class TimeMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("method "+ method.getName()+" start ...........dd...");
        Object o1 = methodProxy.invokeSuper(o,objects);
        System.out.println("method " + method.getName() + " end  .................sss............ ");
        return o1;
    }
}

class Car {
    public void move() {
        System.out.println("Car move ..............");
        try {
            Thread.sleep(new Random().nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
