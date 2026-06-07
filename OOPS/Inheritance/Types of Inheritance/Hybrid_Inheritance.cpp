// Hybrid inheritance is the combination of all types of the inheritance
// Where we have passed the paramteres with constructor creation or object calling
#include<iostream>
#include<string>
using namespace std;

class person
{
    public:
        string name;
        double cgpa;
    
        //simple non-paramterized constructor
        //firstly parent class constructor called even though we creates the child class constructor
        person(string n, double c) : name(n), cgpa(c)
        {
            cout<<"Parent class constructor..\n";
            this->name=name;
            this->cgpa=cgpa;
        }

};

// when objet creates it come to student(child class) but it redirects to person(parent class) as it redirecting it towards parent calss
//so fistly methods of parent class will fullfill
class student :public person
{
    public:
        int roll_no;

        //after calling parent class , we call child class constructor
        student(string n, double c, int r) : person(n, c), roll_no(r)
        {
            cout<<"I am child class constructor..\n";
            this->roll_no=roll_no;
        }
    
        void getInfo(){
            cout<<"Name: "<<name<<endl;
            cout<<"Cgpa: "<<cgpa<<endl;
        }
};

int main()
{
    student s1("Vaibhav",8.9,30);
    s1.getInfo();
    return 0;
}
