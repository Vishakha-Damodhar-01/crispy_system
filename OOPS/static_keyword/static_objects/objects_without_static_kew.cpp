// Without static keyword of object
remember the fow of the output

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
        Bank obj;
    }
    
    cout<<"End of program\n";
    return 0;
    
}

//output:
Construcor
Destructor
End of program

//--> without keyword values push, values pop then end of program
// values not remain in srack till end 
