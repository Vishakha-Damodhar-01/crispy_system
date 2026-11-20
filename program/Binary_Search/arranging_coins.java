Binary Search 
  problem no --> 441 -->Arranging coins

  
class Solution {
    public int arrangeCoins(int n) {
        long left = 1;
        long right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long coinsNeeded = mid * (mid + 1) / 2;

            if (coinsNeeded == n) {
                return (int) mid;
            } else if (coinsNeeded < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) right;
    }
}


//output:
ex-1-->
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.



ex-2-->
  Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.
