package com.picea.designpatterns.strategy.v01;

public class Sorter {

    public static void sort(Dog[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                min = arr[j].compareTo(arr[min]) == -1 ? j:min;
            }
            swap(arr,i,min);
        }

    }

    //sort int

    static void swap(Dog[] arr, int i, int j){
        Dog temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
