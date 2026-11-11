Problem 34
  Medium level --->>  Find First and Last Position of Element in Sorted Array


  class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        
        // Find the first (leftmost) occurrence
        result[0] = findBound(nums, target, true);
        
        // If the target wasn't found at all, no need to search for the end
        if (result[0] == -1) {
            return result;
        }
        
        // Find the last (rightmost) occurrence
        result[1] = findBound(nums, target, false);
        
        return result;
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0;
        int right = nums.length - 1;
        int boundIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                boundIndex = mid; // Record potential answer
                if (isFirst) {
                    right = mid - 1; // Keep searching left for an earlier occurrence
                } else {
                    left = mid + 1;  // Keep searching right for a later occurrence
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return boundIndex;
    }
}
