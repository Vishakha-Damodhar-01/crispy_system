// The default constructore works here in the Non paramised constructor,
// cout<<"Constructor called"<<endl;
// cout<<t1.name<<endl;
// cout<<t1.getsalary()<<endl;

// like here constrictor called in this manner

#include <iostream>
#include <string>
using namespace std;
class Teacher
{
    private:
        double salary;
    
    public:
        Teacher()
        {
            cout<<"Constructor called"<<endl;
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
};
int main() 
{
    Teacher t1;
    t1.name="Vishakha";
    t1.dept="CSE";
    t1.subject="CND";
    t1.setsalary(50000);

    cout<<t1.name<<endl;
    cout<<t1.getsalary()<<endl;
    
    return 0;
}
