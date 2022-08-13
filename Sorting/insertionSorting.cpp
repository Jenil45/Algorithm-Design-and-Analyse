// We using a concept like every element should have lesser valued element at left and greter valud element at right side
#include<iostream>
using namespace std;

void print(int arr[] , int size)
{
    for (int i = 0; i < size; i++)
    {
        cout<<arr[i]<<" ";
    }
    
}

void insertionsort(int arr[] , int size)
{
    // start from 2nd element 
    for (int i = 1; i < size; i++)
    {
        // we define current element and check it that if it is greater or lesser than left side elements
        int current = arr[i];
        int j = i-1;

        while (arr[j] > current && j>=0)
        {
            arr[j+1] = arr[j];
            j--;
        }

        arr[j+1] = current;                                    // set value equal to current value to that shifted element
        
    }
    
    return;
    
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

    cout<<"\nInsertion sorting : "<<endl;
    insertionsort(array , size);

    print(array , size);


    return 0;
}
