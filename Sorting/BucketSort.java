package com.gecg;

import java.util.*;

public class BucketSort {
    public static void Bucket_Sort(float arr[] , int n)
    {

        // making one bucket to store all elements
        Vector<Float>[] buckets = new Vector[n];

        // creating empty list in each index of bucket
        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Float>();
        }

        // adding the element int bucket by calculate logical indexing
        // like index = element*size_of_array and floor value of it
        for (int i = 0; i < n; i++) {
            float x = arr[i]*n;
            int index_add = (int) Math.floor(x);
            buckets[index_add].add(arr[i]);
        }

        // sorting all buckets iof buckets indexed
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        int index = 0;

        // concatenate all element in an array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {

                arr[index++] = buckets[i].get(j);

            }

        }
    }
    public static void main(String[] args) {
        float[] array = {0.7f , 0.4f , 0.75f , 0.6f , 0.2f , 0.795f , 0.66f , 0.125f};
        System.out.println("Before sorting array : "+Arrays.toString(array));
        Bucket_Sort(array , array.length);
        System.out.println("After sorting array : "+Arrays.toString(array));
    }
}
