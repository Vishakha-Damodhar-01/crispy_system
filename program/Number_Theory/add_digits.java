class Solution {
    public int addDigits(int num) {
        int r;
        int sum=0;
        while(num>0)
        {
            r=num%10;
            sum=sum+r;
            num=num/10;
        }
        int p;
        int add=0;
        while(sum>0)
        {
            p=sum%10;
            add=add+p;
            sum=sum/10;
        }
    return add;
    }
}
