package com.picea.designpatterns.abstractfactory.v01;

import com.picea.designpatterns.factorymethod.v03.Moveable;
import com.picea.designpatterns.factorymethod.v03.SimpleVehicleFactory;

/**
 * 设计场景
 * 现代：一个人 开着汽车，吃着面包，ak47开枪
 *
 * 魔法世界：一个魔法师 骑着扫把 ，吃着蘑菇，魔法棒射击
 *
 * 如何灵活的扩展这整个“产品族”？
 */
public class FactoryMain {

    public static void main(String[] args) {
        Car car = new Car();
        car.go();
        AK47 ak47 = new AK47();
        ak47.shoot();
        Bread bread = new Bread();
        bread.eat();

    }
}
