class Solution {
    public int findJudge(int n, int[][] trust) {
        // Track the net trust score for each person.
        // People are labeled 1 to n, so we use an array of size n + 1.
        int[] trustScores = new int[n + 1];
        
        // Loop through all trust relationships
        for (int[] relationship : trust) {
            int personA = relationship[0]; // The person who trusts
            int personB = relationship[1]; // The person who is trusted
            
            // Decrement the score for the person who trusts someone else
            trustScores[personA]--;
            // Increment the score for the person who is trusted
            trustScores[personB]++;
        }
        
        // The town judge must have a net score of exactly n - 1
        for (int i = 1; i <= n; i++) {
            if (trustScores[i] == n - 1) {
                return i;
            }
        }
        
        // If no person meets the judge criteria, return -1
        return -1;
    }
