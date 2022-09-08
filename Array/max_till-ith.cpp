#include<iostream>
using namespace std;
// max till i , find maximum number in array

int max(int a, int b)                                      // make an function of a maximum number
{
    if (a>b)
    {
        return a;
    }
    
    else
    {
        return b;
    }
    
}

int main()
{
    int n;
    cin>>n;

    int arr[n];

    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    
    cout<<"\n The array is \n";

    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    
    int mx = arr[0];                                          // We assume one number of an array as a maximum number

    for (int i = 0; i < n ; i++)
    {
        mx = max(mx , arr[i]);                               // Then wefind maximum number by comparing with mx
    }
    
    cout<<"\n Maximum number in array is = "<< mx;

    return 0;
}
