package com.picea.designpatterns.abstractfactory.v02;

public class ModernFactory extends AbstractFactory{
    @Override
    Food createFood() {
        return new Bread()
                ;
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }
}
