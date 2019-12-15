package com.picea.designpatterns.strategy.v02;

public class Dog implements Comparable<Dog>{
    int weight, height;

    public Dog(int weight, int height){
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Dog d) {
        if (this.weight < d.weight) return -1;
        else if (this.weight > d.weight) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
