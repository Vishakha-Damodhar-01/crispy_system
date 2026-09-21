//Problem 101: Symmteric tree

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }
    
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        // If both nodes are null, they match
        if (t1 == null && t2 == null) {
            return true;
        }
        // If one of them is null or values don't match, it's not symmetric
        if (t1 == null || t2 == null || t1.val != t2.val) {
            return false;
        }
        // Check outer and inner pairs
        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}
