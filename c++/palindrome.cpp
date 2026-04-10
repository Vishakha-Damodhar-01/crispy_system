#include <iostream>
#include<bits/stdc++.h>
using namespace std;
int main() {
    int n,rev=0,r,temp;
    cout<<"Enter a number: "<<endl;
    cin>>n;
    temp=n;
    while(n>0)
    {
        r=n%10;
        rev=rev*10+r;
        n=n/10;
    }
    cout<<"Reverse "<<" is"<<endl<<rev<<endl;
    
    if(temp==rev)
    {
        cout<<temp<< " is palindrome";
    }
    else
    {
        cout<<temp<<" is not palindrome";
    }
    return 0;
}
