Queue -->
  Problem no 2327 : Number of people aware of a secret

public class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long MOD = 1_000_000_007L;
        // dp[i] stores the number of people who found out the secret on day i
        long[] dp = new long[n + 1];
        
        // Day 1 starts with 1 person
        dp[1] = 1;
        
        // Number of people currently active and capable of sharing the secret
        long sharing = 0;
        
        for (int i = 2; i <= n; i++) {
            // People who learned the secret 'delay' days ago can start sharing today
            long newSharers = (i - delay >= 1) ? dp[i - delay] : 0;
            
            // People who learned the secret 'forget' days ago forget it today
            long forgettingPeople = (i - forget >= 1) ? dp[i - forget] : 0;
            
            // Update the active sharing count
            sharing = (sharing + newSharers - forgettingPeople + MOD) % MOD;
            
            // The number of new people who learn the secret today matches the active sharing count
            dp[i] = sharing;
        }
        
        // Calculate the total number of people who still know the secret on day n
        long totalPeople = 0;
        for (int i = n - forget + 1; i <= n; i++) {
            if (i >= 1) {
                totalPeople = (totalPeople + dp[i]) % MOD;
            }
        }
        
        return (int) totalPeople;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test case 1
        System.out.println(sol.peopleAwareOfSecret(6, 2, 4)); // Output: 5
        
        // Test case 2
        System.out.println(sol.peopleAwareOfSecret(4, 1, 3)); // Output: 6
    }
}

  
