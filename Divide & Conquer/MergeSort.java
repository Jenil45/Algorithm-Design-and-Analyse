package com.gecg;

public class MergeSort {

    public static void merge(int arr[] , int start , int mid , int end)
    {
        int[] result = new int[end - start+1];
        int idx=0;            // for traversing result array
        int x=start;          // for traversing first half array
        int y=mid+1;          // for traversing second half array

        while (x <= mid && y<= end)
        {
            if (arr[x] <= arr[y])
            {
                result[idx] = arr[x];
                idx++;
                x++;
            }

            else
            {
                result[idx] = arr[y];
                y++;
                idx++;
            }


        }

        while (x <= mid)
        {
            result[idx] = arr[x];
            idx++;
            x++;
        }

        while (y <= end)
        {
            result[idx] = arr[y];
            y++;
            idx++;
        }
        for (int i = 0  , j=start; j <= end ; i++ ,  j++) {
            arr[j] = result[i];
        }
    }
    public static void divide(int arr[] , int start , int end )
    {
        if (start >= end )
        {
            return;
        }
        int mid = (start+end)/2 ;

        divide(arr , start , mid);
        divide(arr , mid+1 , end);
        merge(arr , start , mid , end);
    }
    public static void main(String[] args) {

        int arr[] = {45,93,100,2,7,8,1};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        divide(arr , 0 , arr.length-1);
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
