//The encapsulation is used for hising the sensitive data
// like an Bank data
// Encapsulation is used for the data security purpose, like here all the other information regarding teacher is public,
// but they don't want to show salary publically, that is why used the get and set methid, so that only the desired person can see it

// Encapsulatio==capsule==Data Security

#include <iostream>
#include <string>
using namespace std;


class Teacher
{
    //properties/ Attributes
    private:
        double salary;
    
    public:
        string name;
        string dept;
        string subject;
        double s;

        //Methods
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
int main() {
    Teacher t1;
    t1.name="Vishakha";
    t1.dept="CSE";
    t1.subject="CND";
    t1.setsalary(50000);

    cout<<t1.name<<endl;
    cout<<t1.getsalary()<<endl;
    
    return 0;
}
