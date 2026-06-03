// This is the code for taking the user input, without parameters
we have semd it from main function  with declaration

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
        person()
        {
            cout<<"Parent class constructor..\n";
        }

};

// when objet creates it come to student(child class) but it redirects to person(parent class) as i redirecting towards it
class student :public person
{
    public:
        int roll_no;

        //after calling parent class , we call child class constructor
        student()
        {
            cout<<"I am child class constructor..\n";
        }
    
        void getInfo(){
            cout<<"Name: "<<name<<endl;
            cout<<"Cgpa: "<<cgpa<<endl;
            cout<<"Roll No: "<<roll_no<<endl;
            
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
    // cout<<"Enter subject: "<<endl;
    // cin>>subject;

    student s1;    //-->**here**
    s1.name=name;
    s1.cgpa=cgpa;
    // s1.subject=subject;
    s1.roll_no=roll_no;
    s1.getInfo();

    return 0;
}

//output:
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
