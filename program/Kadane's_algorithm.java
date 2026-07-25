
public class KadanesAlgorithm {
    public static int[] findMaxSubarrayBounds(int[] nums) {
    int maxSum = nums[0];
    int curSum = 0;
    int maxL = 0, maxR = 0;
    int L = 0;

    for (int R = 0; R < nums.length; R++) {
        if (curSum < 0) {
            curSum = 0;
            L = R; // Reset the left window index forward
        }
        curSum += nums[R];

        if (curSum > maxSum) {
            maxSum = curSum;
            maxL = L;
            maxR = R;
        }
    }
    // Returns [start_index, end_index]
    return new int[] {maxL, maxR};
}

}
