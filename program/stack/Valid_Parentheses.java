//stack-->problem 20-->easy--> Valid Parentheses

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // Quick check: odd length strings can't be valid pairs
        if (s.length() % 2 != 0) {
            return false;
        }
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // If it's an opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If it's a closing bracket, check for matching opening bracket at the top
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.peek();
                if ((ch == ')' && top == '(') || 
                    (ch == '}' && top == '{') || 
                    (ch == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        // If stack is empty, all opening brackets were matched
        return stack.isEmpty();
    }
}
