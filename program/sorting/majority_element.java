Problem no--> 169
  Majority Element

  
 class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
 


//output example:
Example 1:
Input: nums = [3,2,3]
Output: 3
  
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
