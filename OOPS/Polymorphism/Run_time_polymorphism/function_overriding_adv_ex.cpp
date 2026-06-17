//its like the inheritance
// in normal file I have explained all the things, check it out

#include<iostream>
#include<string>
using namespace std;
class Person
{
    public:
        string name;
        int age;
        Person(string name,int age)
        {
            this->name=name;
            this->age=age;
            cout<<"Parent class constructor called\n";
        }
        void show()
        {
            cout<<"Parent class\n";
        }
};

class student:public Person
{
    public:
        student(string name, int age): Person(name,age)
        {
            cout<<"child class constructor called\n";
        }

        void show()
        {
            cout<<"child class\n";
            cout<<"Name: "<<name<<"  "<<"Age: "<<age;
        }
};

int main()
{
    student s1("Tanu",22);
    s1.show();
    return 0;
}


//output:
Parent class constructor called
child class constructor called
child class
Name: Tanu  Age: 22
