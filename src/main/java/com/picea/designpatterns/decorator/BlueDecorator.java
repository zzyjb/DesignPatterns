package com.picea.designpatterns.decorator;



public class BlueDecorator extends Decorator{

    public BlueDecorator(VehicleObject v) {
        super(v);
    }

    @Override
    void colour() {
        addColour();
        super.colour();
    }

    private void addColour() {
        System.out.println("Add blue colour .....");
    }
}
