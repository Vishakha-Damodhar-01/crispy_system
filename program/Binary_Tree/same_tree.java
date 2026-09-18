//Problem 100
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base Case 1: Both nodes are null, meaning they are structurally identical so far
        if (p == null && q == null) {
            return true;
        }
        
        // Base Case 2: One node is null and the other is not, indicating a structural mismatch
        if (p == null || q == null) {
            return false;
        }
        
        // Base Case 3: The values of the current nodes do not match
        if (p.val != q.val) {
            return false;
        }
        
        // Recursively check if the left subtrees match AND the right subtrees match
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

//output:
Input: p = [1,2,3], q = [1,2,3]
Output: true

Input: p = [1,2], q = [1,null,2]
Output: false

Input: p = [1,2,1], q = [1,1,2]
Output: false
