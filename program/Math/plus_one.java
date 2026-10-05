// Problem 66: Plus one

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Loop backward from the least significant digit (right to left)
        for (int i = n - 1; i >= 0; i--) {
            // Case 1 & 2: If the digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // Case 3: If the digit is 9, it becomes 0 (carry over moves to the next loop iteration)
            digits[i] = 0;
        }
        
        // Case 4: If the loop finishes, it means all digits were 9s (e.g., [9, 9, 9])
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // Remaining digits default to 0 in Java
        
        return newNumber;
    }
}


//output:

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
