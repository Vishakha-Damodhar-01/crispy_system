// Question asked in tcs exam
#include <iostream>
#include<bits/stdc++.h>
using namespace std;
int main() {
    float distance, time, speed_ms,speed_kmhr;
    cout<<"Enter a distance: "<<endl;
    cin>>distance;
    cout<<"Enter the time: "<<endl;
    cin>>time;
    
    speed_ms=distance/time;
    speed_kmhr=speed_ms*3.6;
    
    cout<<"Speed in m per sec: "<<speed_ms<<endl;
    cout<<"Speed in km per hr: "<<speed_kmhr<<endl;
    

    return 0;
}
