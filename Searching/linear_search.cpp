#include<iostream>
using namespace std;

void print(int arr[] , int size)
{   
    // iterate every element and print it
    for (int i = 0; i < size; i++)
    {
        cout<<arr[i]<<" ";
    }
    
}

int linearsearch(int arr[] , int size , int key)
{
    // iterate all the element and check or compare key with every element
    for (int i = 0; i < size; i++)
    {
        if (arr[i] == key)
        {
            return i;                         
        }
    }
    return -1;
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
    cout<<"Enter the element that you want to find : ";
    cin>>key;

    // calling the linearserach() function
    found_element_index = linearsearch(array , size , key);

    // printitng the answer
    cout<<"Element is at index : "<<found_element_index;
    return 0;
}
