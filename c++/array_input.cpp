// how to take input in array elements
#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main() 
{
    int n;
    cout<<"Enter no of elemenst you want to add in array: "<<endl;
    cin>>n;
    int num[n];
    cout<<"Enter "<<n<<" elements in array: "<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>num[i];
    }
    cout<<"Array elements are: "<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<num[i]<<" ";
    }
    cout<<"Counting prime numbers in array : "<<endl;
    int count=0;
    for(int i=0;i<n;i++)
    {
        for(j=2;j<=i/2;j++)
        {
            cout<<i;
        }
    }                
    return 0;
}
