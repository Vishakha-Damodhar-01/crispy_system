
// Online C++ compiler to run C++ program online
#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
    try{
        int month;
        cout<<"Enter a month"<<endl;
        cin>>month;
        
        switch(month)
        {
            case 1:
                cout<<"3000";
                break;
                
            case 2:
                cout<<"6000";
                break;
            case 3:
                cout<<"9000";
                break;
            case 4:
                cout<<"12000";
                break;
            case 5:
                cout<<"15000";
                break;
            default:
                cout<<"Invalid input";
        }
    }
    catch (Exception e)
    {
        cout<<"please enter valid positive integer";
        
    }
    return 0;
}
