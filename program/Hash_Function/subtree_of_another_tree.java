// Problem 572: Subtree of another tree

class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // If the main tree is empty, it cannot contain any subtree
        if (root == null) {
            return false;
        }
        
        // 1. Check if the trees rooted at the current nodes are identical
        if (isSameTree(root, subRoot)) {
            return true;
        }
        
        // 2. If not identical, check if subRoot is a subtree of the left or right child
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    // Helper method to check if two trees are completely identical
    private boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null, they are identical
        if (p == null && q == null) {
            return true;
        }
        // If only one of them is null, they are not identical
        if (p == null || q == null) {
            return false;
        }
        // If the values don't match, they are not identical
        if (p.val != q.val) {
            return false;
        }
        
        // Recursively check both the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
