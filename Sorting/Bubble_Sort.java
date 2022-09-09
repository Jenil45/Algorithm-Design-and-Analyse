package com.gecg;

public class Bubble_Sort {

    public static void Bubblesort(int arr[] , int n)
    {
        int counter = 1;
        int j=1;
        while (counter < n)
        {
            j++;
            for (int i = 0; i < (n-counter) ; i++) {

                if (arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            counter++;
        }
    }
    public static void printArray(int arr[], int n) {
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {45,93,1,6,5,78,8};
        System.out.println("Before sorting : ");
        printArray(arr , arr.length);
        Bubblesort(arr , arr.length);
        System.out.println("After sorting : ");
        printArray(arr , arr.length);
    }
}
