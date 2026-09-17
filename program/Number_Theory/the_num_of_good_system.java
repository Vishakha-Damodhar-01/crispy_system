class Solution {
    public int numberOfGoodSubsets(int[] nums) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int mod = 1_000_000_007;
        
        // Count frequency of each number in nums
        long[] count = new long[31];
        for (int num : nums) {
            count[num]++;
        }
        
        // Map each number (2-30) to its prime bitmask representation
        // If a number is not square-free, mark mask as -1
        int[] mask = new int[31];
        int[] primeFactors = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        
        for (int i = 2; i <= 30; i++) {
            int m = 0;
            int temp = i;
            boolean squareFree = true;
            for (int j = 0; j < primeFactors.length; j++) {
                int p = primeFactors[j];
                if (temp % (p * p) == 0) {
                    squareFree = false;
                    break;
                }
                if (temp % p == 0) {
                    m |= (1 << j);
                }
            }
            mask[i] = squareFree ? m : -1;
        }
        
        // DP array where index represents the bitmask of used primes
        long[] dp = new long[1 << 10];
        dp[0] = 1; // Base case: empty subset
        
        for (int i = 2; i <= 30; i++) {
            if (count[i] == 0 || mask[i] == -1) continue;
            
            int currMask = mask[i];
            // Iterate backwards through bitmasks to avoid using the same number twice
            for (int prevMask = (1 << 10) - 1; prevMask >= 0; prevMask--) {
                if ((prevMask & currMask) == 0) {
                    int nextMask = prevMask | currMask;
                    dp[nextMask] = (dp[nextMask] + dp[prevMask] * count[i]) % mod;
                }
            }
        }
        
        long totalGood = 0;
        for (int i = 1; i < (1 << 10); i++) {
            totalGood = (totalGood + dp[i]) % mod;
        }
        
        // Account for number 1: each '1' can either be included or excluded for any valid subset
        if (count[1] > 0) {
            long pow1 = 1;
            for (long i = 0; i < count[1]; i++) {
                pow1 = (pow1 * 2) % mod;
            }
            totalGood = (totalGood * pow1) % mod;
        }
        
        return (int) totalGood;
    }
}
