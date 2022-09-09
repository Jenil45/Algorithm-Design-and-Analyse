package com.gecg;

public class QuickSort {

    public static int partition(int arr[] , int low , int high)
    {
        int pivot = arr[high];
        int i=low-1;

        for (int j = low; j < high ; j++) {
            if (arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i;
    }
    public static void Quicksort(int arr[] , int low , int high)
    {
        if (low < high)
        {
            int pivot_idx = partition(arr , low , high);
            Quicksort(arr , low , pivot_idx-1);
            Quicksort(arr , pivot_idx+1 , high);
        }
    }

    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,93,45,2,1,264};
        printArray(arr);
        Quicksort(arr , 0 , arr.length-1);
        printArray(arr);

    }
}
