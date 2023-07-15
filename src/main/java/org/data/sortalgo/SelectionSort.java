package org.data.sortalgo;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9 };

        // call method using class name
        SelectionSort.selectionSort(data);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }

    private static void selectionSort(int[] data) {

        for(int i=0; i<data.length-1; i++){
            int minIndex = i;
            for (int j=i+1; j<data.length; j++){
                if(data[j] < data[minIndex]){
                    minIndex = j;
                }
            }

            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

}
