// Write a cpp program for prime number

#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cout<<"Enter a number for checking wheather it is prime or not: "<<endl;
    cin>>n;
    int c=0;
    for (int i=2;i<=n/2;i++)
    {      
        if(n%i==0)
        {
            c=1;
            break;
        }
    }
    if(c==0)
    {
        cout<<n<<" is a prime number";
    }
    else
    {
        cout<<n<<" is not a prime number";
    }
    return 0;
}
