// It done in the run time polymorphism only

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

        //make it virtual in parent class only not in child class
        virtual void hello()
        {
            cout<<"Hello from parent class"<<endl;
        }

};
class student:public Person
{
    public:
        void getInfo()
        {
            cout<<"Child class"<<endl;
        }

        //dont make it virtual in the childs class
        void hello()
        {
            cout<<"Hello from child class"<<endl;
        }

        
};
int main()
{
    student s1;
    s1.getInfo();
    s1.hello();
    return 0;
}


//output:
Child class
Hello from child class
