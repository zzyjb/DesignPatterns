package com.picea.designpatterns.strategy.v03;

public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog t1, Dog t2) {
        if (t1.height < t2.height) return -1;
        else if (t1.height > t2.height) return 1;
        else return 0;
    }
}

