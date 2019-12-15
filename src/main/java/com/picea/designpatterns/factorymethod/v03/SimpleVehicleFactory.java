package com.picea.designpatterns.factorymethod.v03;

public class SimpleVehicleFactory {

    public static Moveable createCar() {
        return  new Car();
    }

    public static Moveable createPlane() {
        return  new Plane();
    }
}
