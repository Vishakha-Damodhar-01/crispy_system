// Without static key word

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

// output :
x=: 0
x=: 0
x=: 0
  --> The output remains the same , because it works in the stack like 
       when we satrt the program one value push, again it pull
        again called--->push -->again -->pop

  that's why value remains the same
