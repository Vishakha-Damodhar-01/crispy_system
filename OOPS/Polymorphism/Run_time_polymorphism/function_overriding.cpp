// Its the concept of inheritance basically 
// Function overriding means When child class overtake parent class
//its like the inheritance

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
        }
        void show()
        {
            cout<<"Parent class\n";
        }
};

class student:public Person
{

    void show()
    {
        cout<<"child class\n";
        cout<<Name<<" "<<age;
    }
};

int main()
{
    student s1;
    s1.name="Tanu";
    s1.age=22;
    s1.show();
    return 0;
}

// output:
child class
Tanu 22
