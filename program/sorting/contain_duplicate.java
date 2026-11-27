problem no - 217 --> Contain duplicate


 import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // set.add() returns false if the element already exists in the set
            if (!seen.add(num)) {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        System.out.println(sol.containsDuplicate(new int[]{1, 2, 3, 1})); // true
        System.out.println(sol.containsDuplicate(new int[]{1, 2, 3, 4})); // false
        System.out.println(sol.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})); // true
    }
}
 


//output:
Example 1:
Input:
int[] nums = new int[]{1, 2, 3, 1};
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input:
int[] nums = new int[]{1, 2, 3, 4};
Output: false
Explanation:All elements are distinct.

Example 3:
Input:
int[] nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
Output: true

 

Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109
