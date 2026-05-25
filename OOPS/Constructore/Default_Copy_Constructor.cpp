// Parameterized constructor, where parameters pass with the when the objects get created
// The default constructor is used when we supposed just called the other object through one object
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

        void changeDept(string newDept)
        {
            dept=newDept;
        }

        void getInfo()
        {
            cout<<"Name: "<<name<<endl;
            cout<<"Dept: "<<dept<<endl;
        }
}; 
//--> its a syntax that class should ended up with semi colon.

int main() 
{
    Teacher t1("Vishakha","CSE","CND",50000);
    t1.getInfo();

    cout<<"*******"<<endl;
    
    // whatever we added in the t1 automatically get copied into the t2
  
    Teacher t2(t1);  //--> Default copy constructor get invoke
    t2.getInfo();
    return 0;
}

/// Output:
Name: Vishakha
Dept: CSE
*******
Name: Vishakha
Dept: CSE
    
// Here the copy constructor works and when we pass the values from t1 , the values get copied in t2 as well
// so when we call the t2.getInfo() we get the values from both the objects

// This is how constuctors use in the case of the Data security by creating multiple copies of data in different servers and different locations
