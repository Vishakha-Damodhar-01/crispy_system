#include<iostream>
#include<string>
using namespace std;

// without static value the "value of X" is not updated
void fun()
{
    int x=0;
    cout<<"x=: "<<x<<endl;
    x++;
}
int main()
{
    fun();
    fun();
    fun();
    return 0;
}
