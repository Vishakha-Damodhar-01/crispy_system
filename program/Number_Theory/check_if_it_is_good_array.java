// problem no:1250

public class Solution {
    public boolean isGoodArray(int[] nums) {
        // Start with the first number as the initial GCD
        int currentGcd = nums[0];
        
        for (int num : nums) {
            currentGcd = gcd(currentGcd, num);
            
            // Optimization: If GCD becomes 1, we can stop early
            if (currentGcd == 1) {
                return true;
            }
        }
        
        return currentGcd == 1;
    }
    
    // Helper method to calculate GCD using the Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


//output example from leetcode itself
Example 1:

Input: nums = [12,5,7,23]
Output: true
Explanation: Pick numbers 5 and 7.
5*3 + 7*(-2) = 1
Example 2:

Input: nums = [29,6,10]
Output: true
Explanation: Pick numbers 29, 6 and 10.
29*1 + 6*(-3) + 10*(-1) = 1
Example 3:

Input: nums = [3,6]
Output: false
