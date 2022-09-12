// non-comparison based sor3ting technique
package com.gecg;

import java.util.Arrays;

public class CountSort {
    
    // first make all element digit as max element digit 
    public static void Count_Sort(int arr[] , int n , int k)
    {
        int result[] = new int[k];

        for (int i = 0; i < n; i++) {
            result[arr[i]] = result[arr[i]] + 1;
        }

        int idx=0;
        for (int i = 0; i < k; i++) {

//            int x = arr[i];
            for (int j = 0; j < result[i]; j++) {
                System.out.print(i + " ");
//                idx++;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {2,1,2,3,1,2,4};
        System.out.println(Arrays.toString(arr));
        Count_Sort(arr , arr.length, 5);
    }
}
