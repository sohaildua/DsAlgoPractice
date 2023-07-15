package org.data.sortalgo;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9 };

        // call method using class name
        BubbleSort.bubbleSort(data);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }

    private static void bubbleSort(int[] data) {
        int n = data.length;

        for(int i=0;i<n;i++){
            for (int j=0;j<n-1;j++){
                if(data[i]>data[j+1]){
                    int temp= data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
}

