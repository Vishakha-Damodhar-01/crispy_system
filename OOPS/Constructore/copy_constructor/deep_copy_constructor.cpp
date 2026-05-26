// To overcome the shallow copy drawbacj here it is the deep copy
// first a fall we make a copy of the original object then make changes in the copied object
// so that we can make the changes according to us only

#include<iostream>
#include<string>
using namespace std;

class student 
{
    public:
        string name;
        double* cgpaPtr;
    

        // call the normal object creates for the first time
        student(string name, double cgpa)
        {
            cout<<"&&"<<endl;
            this->name=name;
            cgpaPtr=new double;
            *cgpaPtr=cgpa;
        }
        // custom copy onstructor
        // when we make the copy of the object 
        // like here it call when s2(copy of s1) and s3(copy of s2) creates with little changes

        //Need to make the change in custom copy constructor for the deep-copy
        // deep copy to overcome drawbacks of shallow copy


        student(student &obj)
        {
            cout<<"**"<<endl;
            this->name=obj.name;
            cgpaPtr=new double;   //-->here made change like with pointer_name and added new keyword and there data type
            *cgpaPtr=*obj.cgpaPtr;   //--> here ppointer name and obj.pointer_name where "" * "" mark on boththe sides is important
        }

        void getInfo(){
            cout<<"Name: "<<name<<endl;
            cout<<"Cgpa: "<<*cgpaPtr<<endl;
        }
};

int main()
{
    student s1("Vishakha",8.32);
    student s2(s1);
    s1.getInfo();
    *(s2.cgpaPtr)=9.2;
    s1.getInfo();

    s2.name="Megha";
    s2.getInfo();
    return 0;
}


// output:
&&                //--> normal object creation wala thing called-->parameterised constructor called(because parameters passed with the object)
**                 //-->then copied object, copy constructor called(because it is the copy of the original object)
Name: Vishakha
Cgpa: 8.32
Name: Vishakha
Cgpa: 8.32
Name: Megha
Cgpa: 9.2


  //here first time we have just copied object, 
  // second time we have changed the cgpa and name
