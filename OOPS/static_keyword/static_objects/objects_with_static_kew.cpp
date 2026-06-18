// The any value we take it as static stay till the end of the program
// remember the flow of the output

#include<iostream>
#include<string>
using namespace std;

class Bank
{
    public:

        Bank()
        {
            cout<<"Construcor"<<endl;
        }
        ~Bank()
        {
            cout<<"Destructor"<<endl;
        }
};
int main()
{
    if(true)
    {
        static Bank obj;  //-->staic key word here , take a note of it
    }
    
    cout<<"End of program\n";
    return 0;
    
}

//output:

Construcor
End of program
Destructor

//-->first of all , constructor called -> object push(object added ad keep tracking and changing the values) ,
//                                                         later end program, then destructor -> object pop(values updated and deleted)
