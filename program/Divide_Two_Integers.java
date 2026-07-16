// Divide Two Integers
  
 class Solution {
    public int divide(int dividend, int divisor) {
        double roundoff;
        roundoff=Math.round(dividend/divisor);
        return (int)roundoff;
    }
}

// output:
