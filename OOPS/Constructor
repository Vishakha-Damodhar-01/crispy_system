//This is the base code for whatever tupes of copy constructor we will see


#include<iostream>
#include<string>
using namespace std;

class student 
{
    public:
        string name;
        double cgpa;
    

        // call the normal object creates for the first time
        student(string name, double cgpa)
        {
        cout<<"&&"<<endl;
        this->name=name;
        this->cgpa=cgpa; 
        }
        // custom copy onstructor
        // when we make the copy of the object 
        // like here it call when s2(copy of s1) and s3(copy of s2) creates with little changes
        student(student &obj)
        {
            cout<<"**"<<endl;
            this->name=obj.name;
            this->cgpa=obj.cgpa;
        }

        void getInfo(){
            cout<<"Name: "<<name<<endl;
            cout<<"Cgpa: "<<cgpa<<endl;
        }
};

int main()
{
    student s1("Vishakha",8.32);
    s1.getInfo();

    student s2(s1);
    s2.cgpa=8.96;
    s2.getInfo();

    student s3(s2);
    s3.name="Megha";
    s3.getInfo();

    student s4("Vaibhav",8.92);
    s4.getInfo();

    return 0;
}


// how output will generat
-->  first when new object creates
&&
Name: Vishakha
Cgpa: 8.32

-->these 2 when the copies creates
**
Name: Vishakha
Cgpa: 8.96
**
Name: Megha
Cgpa: 8.96

-->again when the s4 new object creates, it called normal
&&
Name: Vaibhav
Cgpa: 8.92
