class Solution {
    public int countPrimes(int n) {
        int c=0;
        int count=0;
        for(int j=2;j<=n;j++)
        {
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    count+=1;
                }
    
            }
        }
        
        return count;
    }
}
