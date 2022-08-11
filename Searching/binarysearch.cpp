// Note : Array must be in sorted order to find an element through Binary Search algorithm

#include<iostream>
using namespace std;

void print(int arr[] , int size)
{
    for (int i = 0; i < size; i++)
    {
        cout<<arr[i]<<" ";
    }
    
}

int binarysearch(int arr[] , int size , int key)
{
    // we declaring start and end point
    int start=0 , last=size-1;
    int mid;

    // and we use algorithm like find mid page and predict where should be that element 
    while (start<=last)
    {
        mid=(start+last)/2;

        // if at mid we found element then we return that index
        if (arr[mid] == key)
        {
            return mid;
        }

        // otherwise if mid element is greater than that elment we update last index
        else if (arr[mid] > key)
        {
            last = mid-1;
        }

        // otherwise if mid element is lesser than that elment we update last index
        else
        {
            start=mid+1;
        }
    }
    
}

int main(int argc, char const *argv[])
{
    // declaring variables
    int size , key , found_element_index;

    // Define size of an array
    cout<<"Enter the siz eof an array : ";
    cin>>size;

    // declare an array
    int array[size];

    // enter the values in array
    cout<<"Enter the array values : "<<endl;
    for (int i = 0; i < size; i++)
    {
        cout<<"Enter the "<< i+1<<"th value : ";
        cin>>array[i];
    }
    
    // printing the array
    print(array , size);

    // defining key value that you want to find in array
    cout<<"\nEnter the element that you want to find : ";
    cin>>key;

    // finding key value
    found_element_index = binarysearch(array , size , key);

    // printing the output
    cout<<"The element is at index : "<<found_element_index; 

    return 0;
}
