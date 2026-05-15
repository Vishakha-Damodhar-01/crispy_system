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
    // t1.getInfo();

    // whatever we added in the t1 automatically get copied into the t2
  
    Teacher t2(t1);  //--> Default copy constructor get invoke
    t2.getInfo();
    return 0;
}
