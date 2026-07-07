//   --> everytime the object return differernt value
// becuase we havaent provide the static keyword


#include <iostream>
#include <string>
using namespace std;
class StaticObject
{
  public:
    int x;
    void InrX()
    {
        x=x+1;
    }
};
int main() {
    StaticObject obj1;
    StaticObject obj2;
    obj1.x=100;
    obj2.x=200;
    
    cout<<obj1.x<<endl;
    cout<<obj2.x<<endl;
    
    return 0;
}

//output:
100
200

