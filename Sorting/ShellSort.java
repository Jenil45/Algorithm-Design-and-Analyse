package com.gecg;

import java.util.Arrays;

public class ShellSort {

    public static void Shell_Sort(int arr[] , int n)
    {
        int gap = (int) Math.ceil(n/2);
        while (gap > 0)
        {
            for (int i = 0; i+gap < n ; i++) {
                int temp = arr[i];
                arr[i] = arr[i+gap];
                arr[i+gap] = temp;
            }
            gap=gap/2;
        }
    }

    public static void main(String[] args) {
        int arr[] = {45 , 93 , 1 , 4 , 28};
        System.out.println(Arrays.toString(arr));
        Shell_Sort(arr , arr.length);
        InsertionSortt.Insertion_Sort(arr ,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
