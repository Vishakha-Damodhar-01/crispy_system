 Problem no 104:
   max depth of binary tree


-->Binary Tree


  class Solution {
    public int maxDepth(TreeNode root) {
        // Base case: if the current node is null, the depth is 0
        if (root == null) {
            return 0;
        }
        
        // Recursively find the depth of the left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        // The maximum depth at the current node is the maximum of the two subtrees plus 1 (for the current node)
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
   
output:
Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2
