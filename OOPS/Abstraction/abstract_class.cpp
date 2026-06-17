// This is the code for the abstract classes
// Basically it is used for the data security by hiding the imp data 
// the access modifiers--> public, private, protected is used for the data hiding 

// but the abstract class is useful for the data hiding as well as for showing the useful data only

#include<iostream>
#include<string>
using namespace std;

//abstract class
// abstract classs is blue print of all the classes 
class Shape
{
    virtual void draw()=0;
};
//classes are the blue print for objects
class square:public Shape
{
    public:
        void draw()
        {
            cout<<"Draw a square"<<endl;
        }        
};
class rectangle:public Shape
{
    public:
        void draw()
        {
            cout<<"Draw a rectangle"<<endl;
        }
};
int main()
{
    square s1;
    s1.draw();
    rectangle r1;
    r1.draw();   
    return 0;
}


//output:
Draw a square
Draw a rectangle
