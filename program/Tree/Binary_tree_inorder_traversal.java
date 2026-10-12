// Tree --> Problem no : 94 Binary Tree inorder traversal
//Here we are providing the --> Time and space complexity as O(n)
//But by using **Moris Traversal** we can improve the complexity as to O(1)


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    private void traverse(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        
        traverse(node.left, result);  // Traverse left subtree
        result.add(node.val);         // Visit current node
        traverse(node.right, result); // Traverse right subtree
    }
}



Input: root = [1]
Output: [1]


