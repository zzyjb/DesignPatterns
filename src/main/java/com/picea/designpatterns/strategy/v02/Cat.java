package com.picea.designpatterns.strategy.v02;

public class Cat implements Comparable<Cat>{

    int weight, height;

    public Cat(int weight, int height){
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Cat d) {
        if (this.weight < d.weight) return -1;
        else if (this.weight > d.weight) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
