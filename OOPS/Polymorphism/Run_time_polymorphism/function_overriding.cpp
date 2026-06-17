// Its the concept of inheritance basically 
// Function overriding means When child class overtake parent class
//its like the inheritance

//1. if we make the object of child class, the method inside it get the output, like child class overrride the parent class
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






//2. If we make the parent class , them the parent class will get execute
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
    Person s1;
    s1.getInfo();
    return 0;
}
//output:
Parent class
