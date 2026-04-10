// Rverse of a number in cpp
#include <iostream>
#include<bits/stdc++.h>
using namespace std;
int main() {
    int n,rev=0,r;
        rev=rev*10+r;
    cout<<"Enter a number: "<<endl;
    cin>>n;
   
    while(n>0)
    {
        r=n%10;
        rev=rev*10+r;
        n=n/10;
    }
    cout<<"Reverse "<<" is"<<endl<<rev;

    return 0;
}
