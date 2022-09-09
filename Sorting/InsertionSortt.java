package com.gecg;

public class InsertionSortt {

    public static void Insertion_Sort(int arr[], int n)
    {
        for (int i = 1; i <= n; i++) {
            int current = arr[i];
            int j = i-1;
            while ( j >= 0 && arr[j] > current )
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
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
        Insertion_Sort(arr , arr.length-1);
        System.out.println("After sorting : ");
        printArray(arr , arr.length);
    }
}
