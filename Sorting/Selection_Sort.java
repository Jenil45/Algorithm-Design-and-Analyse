package com.gecg;

public class Selection_Sort {

    public static void SelectionSort(int arr[] , int n)
    {
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n ; j++) {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {45,93,1,6,5,78,88};
        System.out.println("Before sorting : ");
        printArray(arr , arr.length);
        SelectionSort(arr , arr.length);
        System.out.println("After sorting : ");
        printArray(arr , arr.length);
    }
}
