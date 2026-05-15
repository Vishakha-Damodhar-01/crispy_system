// Parameterized constructor, where parameters pass with the when the objects get created
#include <iostream>
#include <string>
using namespace std;
class Teacher
{
    private:
        double salary;
    
    // parametrised constructor
    public:
        Teacher(string n,string d,string s,double sal)
        {
            name=n;
            dept=d;
            subject=s;
            salary=sal;
        }

        string name;
        string dept;
        string subject;
        // double s;

        Teacher(Teacher &OrgObj) //-> Custom copy constructor, when a complete data from one location is get copied , it copied it with the help of address
                                 //that's why use the "&"symbol, data store in &t1 stored (copied) in t2....
        {
            cout<<"Custom constructor"<<endl;
            this->name=OrgObj.name;
            this->dept=OrgObj.dept;
            this->subject=OrgObj.subject;
            this->salary=OrgObj.salary;
        }

        void changeDept(string newDept)
        {
            dept=newDept;
        }

        void getInfo()
        {
            cout<<"Name: "<<name<<endl;
            cout<<"Dept: "<<dept<<endl;
            cout<<"Salary: "<<salary<<endl;

        }
}; 
//--> its a syntax that class should ended up with semi colon.

int main() 
{
    Teacher t1("Vishakha","CSE","CND",50000);
    t1.getInfo();

    cout<<"***"<<endl;

    Teacher t2(t1);
    t2.getInfo();
    return 0;
}


//output:
Name: Vishakha
Dept: CSE
Salary: 50000
***
Custom constructor
Name: Vishakha
Dept: CSE


// the same method is applicable to both the forms
