#include<iostream>
using namespace std;

void print(int arr[] , int size)
{
    for (int i = 0; i < size; i++)
    {
        cout<<arr[i]<<" ";
    }
    
}

void selectionsort(int arr[] , int size)
{
    // make an variable to store temporory value
    int temp;

    // we have to iterate over first n-1 element
    for (int i = 0; i < size-1; i++)
    {

        // here we iterate over i+1 to last element 
        for (int j = i+1; j < size; j++)
        {

            // if there is no correct pair then swapping
            if (arr[i] > arr[j])
            {
                temp = arr[i];                      // store in temporary data container
                arr[i] = arr[j];                    // swapping s-1
                arr[j] = temp;                      // swapping s-2
            }

            else
            {
                continue;
            }
            
        }
        
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

    selectionsort(array , size);

    print(array , size);


    return 0;
}
