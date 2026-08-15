public class Solution {
    public boolean canJump(int[] nums) {
        // Tracks the farthest index we can currently reach
        int maxReachable = 0; 
        
        for (int i = 0; i < nums.length; i++) {
            // If the current index is past the farthest reachable point, we are stuck
            if (i > maxReachable) {
                return false;
            }
            
            // Update the farthest reachable index from the current position
            maxReachable = Math.max(maxReachable, i + nums[i]);
            
            // Optimization: If we can already reach or exceed the last index, return true
            if (maxReachable >= nums.length - 1) {
                return true;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Solution game = new Solution();
        
        int[] successCase = {2, 3, 1, 1, 4};
        System.out.println(game.canJump(successCase)); // Output: true
        
        int[] failureCase = {3, 2, 1, 0, 4};
        System.out.println(game.canJump(failureCase)); // Output: false
    }
}


//output:
Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.

