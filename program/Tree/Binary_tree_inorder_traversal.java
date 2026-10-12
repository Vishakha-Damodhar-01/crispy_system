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


///output:
Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
Output: [4,2,6,5,7,1,3,9,8]

Input: root = []
Output: []

Input: root = [1]
Output: [1]


