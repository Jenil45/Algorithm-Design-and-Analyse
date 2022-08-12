// In bubble sort if we have n elements then we have to perform our iteration n-1 times 
#include<iostream>
using namespace std;

void print(int arr[] , int size)
{
    for (int i = 0; i < size; i++)
    {
        cout<<arr[i]<<" ";
    }
    
}

void bubblesort(int arr[] , int size)
{
    // make an variable to store temporory value
    int temp;

    // make counter to show which iteration is doing
    int counter = 1;
    
    // we performing main code size-1 times 
    while (counter < size)
    {
        for (int i = 0; i < size-counter; i++)
        {
            if (arr[i] > arr[i+1])
            {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            
        }
        
    }
    
    
}

int main(int argc, char *argv[])
{
    // declaring variables
    int size;

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

    cout<<"\nBubble sorting : "<<endl;
    bubblesort(array , size);

    print(array , size);


    return 0;
}
