when deconstrictor delete they didn't notify and not even delete the ptr, they delete the value inside that pointer from heap memory ,
  so there will no memory leak (memory using for unusable things lateron ) which is very important as industry level and big organizations
most must asked question in the company 

as like we used **new** keyword for creating the new ptr or any data in heap memory, we use **delete** keyword for the deleig memeory inside heap memory 

#include<iostream>
#include<string>
using namespace std;

class student 
{
    public:
        string name;
        double* cgpaPtr;
    
        student(string name, double cgpa)
        {
            cout<<"&&"<<endl;
            this->name=name;
            cgpaPtr=new double;
            *cgpaPtr=cgpa;
        }
        
        //default deconstructor is called when we have supposed to use static memory, like stack (here name)
        //customized deconstructor use **tilt** symbol   --> **  ~  **
        // as for creation new ptr we use *new* keyword , for deleting the ptr form heap i.e dyanmic memory we use *delete keyword*

        as for creation new ptr we use **new** keyword , for deleting the ptr form heap i.e dyanmic memory we use **delete** keyword

        ~student()
        {
            cout<<"I am destructor"<<endl;
            delete cgpaPtr;
        }
    
        void getInfo(){
            cout<<"Name: "<<name<<endl;
            cout<<"Cgpa: "<<*cgpaPtr<<endl;
        }
};

int main()
{
    student s1("Vishakha",8.32);
    s1.getInfo();
    return 0;
}


//output:
&&
Name: Vishakha
Cgpa: 8.32
I am destructor
