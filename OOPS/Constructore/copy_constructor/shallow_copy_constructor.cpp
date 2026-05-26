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


// 2.The main problem in shallow copy is when we have make the copy of the one object into other, 
// what the issue we face is that copy is made in both the objets actually get printed in both the side
// if we make the copy of original object, made the changes in the copy object
// still the value got reflected on both the sides object and copy object both
// This is the problem of **shallow_copy**

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

        student(student &obj)
        {
            cout<<"**"<<endl;
            this->name=obj.name;
            this->cgpaPtr=obj.cgpaPtr;
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

    return 0;
}


//o/p:
&&
**
Name: Vishakha
Cgpa: 8.32
Name: Vishakha
Cgpa: 9.2

    //even though we have changed s2 value, its get reflected in the s1 too 
    **Drawback of Shaloow Copy**
