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
        double s;

        void changeDept(string newDept)
        {
            dept=newDept;
        }
        
        void setsalary(double s)
        {
            salary=s;
        }
        double getsalary()
        {
            return salary;
        }
        void getInfo()
        {
            cout<<"Name: "<<name<<endl;
            cout<<"Dept: "<<dept<<endl;

        }
};
int main() 
{
    Teacher t1("Vishakha","CSE","CND",50000);
    t1.getInfo();
    return 0;
}
