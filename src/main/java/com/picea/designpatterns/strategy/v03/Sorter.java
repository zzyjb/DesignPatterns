package com.picea.designpatterns.strategy.v03;

public class Sorter<T> {

    public void sort(T[] arr,Comparator<T> comparator) {
        for (int i = 0; i < arr.length -1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                min = comparator.compare(arr[j],arr[min]) == -1 ? j:min;
            }
            swap(arr,i,min);
        }

    }

    //sort int

    void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
