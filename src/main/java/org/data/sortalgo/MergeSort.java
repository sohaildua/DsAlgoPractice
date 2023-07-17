package org.data.sortalgo;

public class MergeSort {

    public static void divide(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;

        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        conquer(arr, low, mid, high);
    }

    private static void conquer(int[] arr, int low, int mid, int high) {
        int[] mergedArray = new int[high - low + 1];

        int idx1 = low;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= high) {
            if (arr[idx1] <= arr[idx2]) {
                mergedArray[x++] = arr[idx1++];
            } else {
                mergedArray[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            mergedArray[x++] = arr[idx1++];
        }

        while (idx2 <= high)  {
            mergedArray[x++] = arr[idx2++];
        }

        for (int i = 0, j = low; i < mergedArray.length; i++, j++) {
            arr[j] = mergedArray[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 5, 2, 4, 1};
        int n = arr.length;
        divide(arr, 0, n - 1);

    }

}
