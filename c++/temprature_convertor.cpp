
#include <iostream>
#include<bits/stdc++.h>
using namespace std;
int main() {
    int C,F;
    float celcius,fahrenheit;
    cout<<"Enter temp in celcius: "<<endl;
    cin>>celcius;
    cout<<"Enter temp in fahrenheit: "<<endl;
    cin>>fahrenheit;
    celcius=(F-32)*5/9;
    fahrenheit=C*9/5+32;
    cout<<"Celcius to fahrenheit conversion: "<<fahrenheit<<endl;
    cout<<"fahrenheit to celcius conversion: "<<celcius<<endl;
    return 0;
}
