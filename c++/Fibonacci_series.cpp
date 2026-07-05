// The program is giving a logic of Fibonacci series in c++, like where we can print a fibonacci series, one of the important 
// interview question , must went through it, iniialize first =0, second=1, then add then stored in next=first+second;
// everytime the loop run it will check till how much it have to walk , it weill run and always print first number
// in the loop we have given the logic:

next=first+second  --->we add them here first      
first=second       --->so the pointer say first to send digit
second=next        --->now the next number means addition take the second place and loop continues


#include <iostream>
#include <string>
using namespace std;
int main() {
    int first=0;
    int second=1;
    int next;
    int n;
    cout<<"Enter a number till which you want a fibonacci series: "<<endl;
    cin>>n;
    cout<<"The fibonacci series upto "<<n<<" is:"<<endl;

    for(int i=0;i<=n;i++)
    {
        cout<<first<<"\t";
        int next=first+second;
        first=second;
        second=next;
        
    }
    return 0;
}

//output:
Enter a number till which you want a fibonacci series: 
5
The fibonacci series upto 5 is:
0	1	1	2	3	5	
