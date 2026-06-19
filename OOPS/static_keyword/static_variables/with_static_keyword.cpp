// with static keyword
// whenever we run the fun , the value changes according to whatever we want because , it stores the data somewhere else till the end of the program
// like the value changes with whatever we want to change with

#include<iostream>
#include<string>
using namespace std;
// with static keey word "Value of x gets updated"

void fun()
{
    static int x=0;  //-->we have used the static keyword here 
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

//output:
x=: 0
x=: 1
x=: 2

  --> Value changes 
      according to the whatever we have write inside the function
