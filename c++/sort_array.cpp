#include <bits/stdc++.h>
using namespace std;
int main() 
{
    int n;
    cout<<"Enter no of elemenst you want to add in array: "<<endl;
    cin>>n;
    int num[n];
    cout<<"Enter "<<n<<" elements in array: "<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>num[i];
    }
    cout<<"Array elements are: "<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<num[i]<<" ";
    }

    int n = sizeof(arr) / sizeof(arr[0]);
    std::sort(arr, arr + n);

    for (int i : arr) std::cout << i << " ";
    return 0;
  
return 0;
}
