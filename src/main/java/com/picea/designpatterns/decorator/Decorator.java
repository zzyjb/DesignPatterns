package com.picea.designpatterns.decorator;

public abstract class Decorator extends VehicleObject {

    private VehicleObject vehicleObject;

    public Decorator(VehicleObject v) {
        this.vehicleObject = v;
    }

    @Override
    void colour() {
        this.vehicleObject.colour();
    }
}
