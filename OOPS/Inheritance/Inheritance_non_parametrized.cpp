//parameters are passed separately

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
        }
};

int main()
{
    student s1;
    s1.name="Vaibhav";
    s1.cgpa=9.2;
    s1.roll_no=30;
    s1.getInfo();
    return 0;
}
