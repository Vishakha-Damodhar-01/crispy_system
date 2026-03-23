// # Q1: Gym Membership Problem Statement
// # The gym offers membership plans for specific durations. The cost of each plan is as follows:
// # 1-month membership → ₹2000
// # 3-month membership → ₹5000
// # 6-month membership → ₹9000
// # 9-month membership → ₹12000
// # 12-month membership → ₹15000
// # Write a program that:
// # Takes the membership duration (in months) as input.
// # Displays the corresponding membership cost.
// # If the user enters a duration other than the specified plans, the program should display an error message:"Invalid Input"

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
