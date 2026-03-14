// Write a cpp program for prime number

#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n,i,count=0;
    cout<<"enter a number: "<<endl;
    cin>>n;
    for(i=2;i<n;i++)
    {
        count=1;
        break;
    }
    
    if(count==0)
    {
        cout<<n<< " is a Prime number ";
    }
    else
    {
        cout<<n<<" is not a prime number ";
    }
    return 0;
}
