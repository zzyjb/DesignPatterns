package com.picea.designpatterns.decorator;

public class Car extends VehicleObject {
    @Override
    void colour() {
        System.out.println("Car colour : red " );
    }
}
