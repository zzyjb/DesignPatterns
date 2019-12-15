package com.picea.designpatterns.abstractfactory.v02;

/**
 * 设计场景
 * 现代：一个人 开着汽车，吃着面包，ak47开枪
 *
 * 魔法世界：一个魔法师 骑着扫把 ，吃着蘑菇，魔法棒射击
 *
 * 如何灵活的扩展这整个“产品族”？
 *
 * 定义三个抽象类
 * Food、Vehicle、Weapon  实物、交通工具、武器
 *
 * 定义一个工厂抽象类
 * AbstractFactory，里面生产三个抽象类
 *
 * 定义ModernFactory、MagicFactory实现AbstractFactory抽象工厂
 * 如果扩展产品族，则定义一个对象，实现AbstractFactory
 *
 * 形容词 用接口
 * 名词   用抽象类
 *
 */
public class FactoryMain {

    public static void main(String[] args) {
//        AbstractFactory factory = new ModernFactory();
        AbstractFactory factory = new MagicFactory();
        Vehicle v = factory.createVehicle();
        v.go();
        Weapon w = factory.createWeapon();
        w.shoot();
        Food f = factory.createFood();
        f.eat();
    }
}
