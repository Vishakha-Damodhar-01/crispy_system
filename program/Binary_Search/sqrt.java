//Problem no 69-->sqrt(x)

class Solution {
    public int mySqrt(int x) {
        // Base cases for 0 and 1
        if (x < 2) {
            return x;
        }

        int left = 2;
        int right = x / 2; // The square root of x (where x >= 2) is never greater than x/2
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Using division (mid == x / mid) instead of multiplication (mid * mid == x)
            // to prevent integer overflow errors.
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                ans = mid; // Update ans because mid could be the floor value
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        return ans;
    }
}
