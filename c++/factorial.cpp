#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    long fact=1;
    cout<<"Enter a number: "<<endl;
    cin>>n;
    for(int i=1;i<=n;i++)
    {
        fact=fact*i;
    }
    cout<<" The factorial of "<<n<<" is: "<<fact;
    return 0;
}

// example output:
// Enter a number:
// 5
// Factorial of 5 is 120
