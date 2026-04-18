// Find the number like normal search number 
#include <iostream>
#include<bits/stdc++.h>
using namespace std;
int main() {
    int arr[]={5,85,22,6};
    int i;
    int num;
    int count=0;
    cout<<"Enter a number which you want to find"<<endl;
    cin>>num;
    for(i=0;i< sizeof(arr);i++)
    {
        if(arr[i]==num)
        {
            count=1;
            break;
        }
    }
    
    if(count==1)
    {
        cout<<"found";
    }
    else
    {
        cout<<"Not found";
    }

    return 0;
}
