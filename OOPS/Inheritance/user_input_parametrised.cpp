// here we have took a user input , even which is the paramaterise form
// not added much ,just took user input and passed the variable name with the time of object creation
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
    string name;
    double cgpa;
    int roll_no;
    string subject;
    cout<<"Enter name: "<<endl;
    cin>>name;
    cout<<"Enter cgpa: "<<endl;
    cin>>cgpa;
    cout<<"Enter Roll no: "<<endl;
    cin>>roll_no;
    student s1(name,cgpa,roll_no);
    s1.getInfo();
    return 0;
}

output:
Enter name: 
vish
Enter cgpa: 
9.9
Enter Roll no: 
30
  
Parent class constructor..
I am child class constructor..
  
Name: vish
Cgpa: 9.9
