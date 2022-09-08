#include<iostream>
using namespace std;

void printarray(int arr[] , int n)
{
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    
}

int partition(int arr[] ,  int low , int high)
{
    int pivot = arr[low];
    int i = low+1;
    int j = high;
    int temp;
    
    do
    {
        while (arr[j] > pivot)
        {
            j--;
        }

        while (arr[i] <= pivot)
        {
            i++;
        }
        
        if (i<j)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    } while (i < j);

    temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;
    return j;

}

void quicksort(int arr[] , int low , int high)
{
    int partitionidx;

    if (low<high)
    {
        partitionidx = partition(arr , low , high);
        quicksort(arr , low , partitionidx-1);
        quicksort(arr , partitionidx+1 , high);
    }
    
}

int main()
{
    int arr[10];
    int n = 10;

    for (int i = 0; i < n; i++)
    {
        cout<<"Enter an element ";
        cin>>arr[i];
    }
    
    quicksort(arr , 0 , 9);
    printarray(arr , n);
    return 0;
}
