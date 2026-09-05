//This is the case from which you are able to solve the problem
class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10; // Extract the last digit
                num /= 10;       // Remove the last digit
            }
            num = sum; // Update num with the sum of its digits
        }
        return num;
    }
}


//This is the one case
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
