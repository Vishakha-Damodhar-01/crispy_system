// Its the concept of inheritance basically 
// Function overriding means When child class overtake parent class
//its like the inheritance

#include<iostream>
#include<string>
using namespace std;

class Person
{
    public:
        void getInfo()
        {
            cout<<"Parent class"<<endl;
        }

};
class student:public Person
{
    public:
        void getInfo()
        {
            cout<<"Child class"<<endl;
        }
        
};
int main()
{
    student s1;
    s1.getInfo();
    return 0;
}


//output:
Child class
