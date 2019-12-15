package com.picea.designpatterns.decorator;



public class BlackDecorator extends Decorator{

    public BlackDecorator(VehicleObject v) {
        super(v);
    }

    @Override
    void colour() {
        addColour();
        super.colour();
    }

    private void addColour() {
        System.out.println("Add black colour .....");
    }
}
