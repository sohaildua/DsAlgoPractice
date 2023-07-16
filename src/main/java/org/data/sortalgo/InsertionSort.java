package org.data.sortalgo;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9 };

        // call method using class name
        InsertionSort.insertionSort(data);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }

    private static void insertionSort(int[] data) {

        for(int i=1; i<data.length;i++){
            int current = data[i];
            int j=i-1;
            while (j>=0 && current<data[j]){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = current;
        }
    }
}
