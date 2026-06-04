// Multi- Level Inheritance means -->person to student to Gradstudent like this
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
    
    
};

class gradstudent:public student
{
    public:
        string subject;
        gradstudent(string n, double c, int r,string s): student(n,c,r),subject(s)
        {
            cout<<"grad studemt"<<endl;
            this->subject=subject;
        }
        void getInfo(){
            cout<<"Name: "<<name<<endl;
            cout<<"Cgpa: "<<cgpa<<endl;
            cout<<"Roll No: "<<roll_no<<endl;
            cout<<"Subject: "<<subject<<endl; 
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
    cout<<"Enter subject: "<<endl;
    cin>>subject;
    
    gradstudent s1(name,cgpa,roll_no,subject);
    s1.getInfo();
    return 0;
}


//output:
Enter name: 
Vishakha
Enter cgpa: 
9.31
Enter Roll no: 
30
Enter subject: 
Computer Science
Parent class constructor..
I am child class constructor..
Name: Vishakha
Cgpa: 9.31
Roll No: 30
Subject: Computer
