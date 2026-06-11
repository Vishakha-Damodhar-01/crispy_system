// The constructor overload means, like there are 2 constructors are available 
//so on the basis of how the data is transfered the constructor called, like if we pass paramters with object reation then paramaertrized constructor called 
// when we create paramaters later after object creation and then pass it , then non-paramaterized construuctor called
// let see the examples of it

// Everything depends on the parameters passed

//1. Paramterized Constructor
#include<iostream>
#include<string>
using namespace std;

class person
{
    public:
        string name;
        int age;

    person()
    {
        cout<<"Non parametrized constructor\n";
    }

    person(string name,int age)
    {
        cout<<"paramterized constrcutor\n";
        this->name=name;
        this->age=age;
    }
    void getinfo()
    {
        cout<< name<<" "<<age<<endl;
    }
};
int main()
{
    person p1("Vish",21);
    p1.getinfo();
    return 0;
}
//output:
paramterized constrcutor
Vish 21


  
//2. Non-Paramterized Constructor
#include<iostream>
#include<string>
using namespace std;

class person
{
    public:
        string name;
        int age;

    person()
    {
        cout<<"Non parametrized constructor\n";
    }

    person(string name,int age)
    {
        cout<<"paramterized constrcutor\n";
        this->name=name;
        this->age=age;
    }
    void getinfo()
    {
        cout<< name<<" "<<age<<endl;
    }
};
int main()
{
    person p1;
    p1.name="vish";
    p1.age=21;
    p1.getinfo();
    return 0;
}
// output: 
Non parametrized constructor
vish 21
