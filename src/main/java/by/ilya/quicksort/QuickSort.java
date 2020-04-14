package by.ilya.quicksort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int [] arr = {3,1,5,7,11,3,7};
        Arrays.stream(arr).forEach(el -> System.out.print(" " + el));
        quickSort(arr,0, 6);
        System.out.println();
        Arrays.stream(arr).forEach(el -> System.out.print(" " + el));
    }

    static void quickSort(int[] arr, int low, int high){


        if (low < high) {

            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);

        }

    }

    static int partition(int[] arr, int low, int high){

        int pivot = arr[high];

        int i = low - 1;

        for(int j = low; j < high; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}
