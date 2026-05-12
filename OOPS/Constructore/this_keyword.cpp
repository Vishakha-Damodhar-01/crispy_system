// We will see the use of *this* keywordin cpp as well as in the constructor
// Basically its mostly used when , we supposed to use the name same for object creation and the parameters too

#include<iostream>
#include<string>
using namespace std;

class Teacher
{
  string name;
  string dept;
  string subject;

  private:
    double salary;

  public:
    Teacher(string name, string dept,string subject, double salary)
{
    // Now here the object and the parameters names are the same
    // we want to differentiate between objects and parameters
    // left side-- objects and right side-- parameters
    // we use pointer (this-->) to the left side

    this->name=name;
    this->dept=dept;
    this->subject=subject;
    this->salary=salary;
}

void getInfo()
{
  cout<<"Name: "<<name<<endl;
}
};

int main()
{
  Teacher t1("Vishakha","CSE","CND",50000);
  t1.getInfo();
  return 0;
}

