//Problem no 32-->Stack --> Longest vaild parentheses
import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String s) {
        // Initialize stack to keep track of indices
        Stack<Integer> stack = new Stack<>();
        
        // Push -1 as the initial base/sentinel index
        stack.push(-1);
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                // Store the index of the opening bracket
                stack.push(i);
            } else {
                // Pop the top index for a matching closing bracket
                stack.pop();
                
                if (stack.isEmpty()) {
                    // If empty, this closing bracket is unmatched. 
                    // Update the base marker to the current index.
                    stack.push(i);
                } else {
                    // Calculate length of the current valid substring
                    int currentLength = i - stack.peek();
                    maxLength = Math.max(maxLength, currentLength);
                }
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        Solution solver = new Solution();
        
        // Test cases
        System.out.println(solver.longestValidParentheses("(()"));    // Output: 2
        System.out.println(solver.longestValidParentheses(")()())")); // Output: 4
        System.out.println(solver.longestValidParentheses(""));       // Output: 0
    }
}



//output:
Example 1:

Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".
Example 2:

Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".
Example 3:

Input: s = ""
Output: 0
