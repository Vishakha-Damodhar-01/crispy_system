class Solution {
    public int removeElement(int[] nums, int val) {
        // Pointer to track the index for the next valid element
        int k = 0; 
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, keep it
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++; // Move the pointer forward
            }
        }
        
        // k represents the new length of the modified array
        return k; 
    }
}
