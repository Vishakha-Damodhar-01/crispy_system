// 1. When we have  make a memory for dynamic memeory allocation-->heap
#include<iostream>
#include<string>
using namespace std;

class student 
{
    public:
        string name;
        double* cgpaPtr; //-->* pointer mark is imp
    

              // call the normal object creates for the first time
        student(string name, double cgpa)
        {
            cout<<"&&"<<endl;
            this->name=name;
            cgpaPtr=new double;  // this one
            *cgpaPtr=cgpa;   // this one imp, take a look how its converted
        }
              // custom copy onstructor
              // when we make the copy of the object 
              // like here it call when s2(copy of s1) and s3(copy of s2) creates with little changes

        student(student &obj)
        {
            cout<<"**"<<endl;
            this->name=obj.name;
            this->cgpaPtr=obj.cgpaPtr;   //--> here we take for pointer name not for the variable name directly
        }

        void getInfo(){
            cout<<"Name: "<<name<<endl;
            cout<<"Cgpa: "<<*cgpaPtr<<endl;  //--> print with *pointer_name
        }
};

int main()
{
    student s1("Vishakha",8.32);
    s1.getInfo();
    return 0;
}

// o/p
&&
Name: Vishakha
Cgpa: 8.32
