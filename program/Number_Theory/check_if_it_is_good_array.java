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
