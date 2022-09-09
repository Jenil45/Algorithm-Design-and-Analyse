package com.gecg;

public class Heap_Sort {

    // work only when lower part is already a heap
    public static void Heapify(int arr[], int n, int idx) {
        int top = idx;
        int left = 2 * idx;
        int right = 2 * idx + 1;
        int temp;

        // logic building is like that, there is one top and another two are its child then if child > top swap and heapify for next
        if (left <= n && arr[left] > arr[top]) {
            top = left;
        }

        if (right <= n && arr[right] > arr[top]) {
            top = right;
        }

        if (top != idx) {
            // swapping of top and idx
            temp = arr[idx];
            arr[idx] = arr[top];
            arr[top] = temp;

            Heapify(arr, n, top);
        }
    }

    public static void printHeap(int arr[], int n) {
        for (int i = 0; i <=n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void buildHeap(int arr[], int n) {
        for (int i = n / 2; i >= 0; i--) {
            Heapify(arr, n, i);
        }
//        System.out.println();
    }

    public static void Heapsort(int arr[] , int n)
    {
        for (int i=n ; i>=0 ; i-- )
        {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            Heapify(arr , i-1 , 0);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 6, 45, 18, 20, 93, 7};
        System.out.println("Before Heap Tree build : ");
        printHeap(arr, 6);
        buildHeap(arr, 6);
        System.out.println("After Heap Tree build : ");
        printHeap(arr, 6);
        Heapsort(arr ,6);
        System.out.println("Heap Sort : ");
        printHeap(arr , 6);
    }
}
