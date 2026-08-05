problem link : https://leetcode.com/problems/add-binary/?envType=problem-list-v2&envId=bit-manipulation

class Solution {
    public String addBinary(String a, String b)
    {
        resa="";
        resb="";
        while(a!=1)
        {
            if(a%2==1)
            {
                resa+="1";
            }
            else
            {
                resa+="0";
            }
            a=a/2;
        }
        reverse(resa);

        while(b!=1)
        {
            if(b%2==1)
            {
                resb+="1";
            }
            else
            {
                resb+="0";
            }
            b=b/2;
        }
        reverse(resb);
        string add="";
        add=resa+resb;
        return add;
    }
}
