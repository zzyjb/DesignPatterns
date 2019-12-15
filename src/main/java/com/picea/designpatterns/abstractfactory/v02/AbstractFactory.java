package com.picea.designpatterns.abstractfactory.v02;

public abstract class AbstractFactory {
    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon createWeapon();
}
