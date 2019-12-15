package com.picea.designpatterns.strategy.v02;

public class Sorter {

    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                min = arr[j].compareTo(arr[min]) == -1 ? j:min;
            }
            swap(arr,i,min);
        }

    }

    //sort int

    static void swap(Comparable[] arr, int i, int j){
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
