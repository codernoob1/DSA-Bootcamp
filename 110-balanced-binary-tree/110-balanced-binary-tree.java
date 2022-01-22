/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }
    int dfsHeight(TreeNode root){
        
        if(root == null) return 0;
        
        int leftHeight = dfsHeight(root.left);
        if(leftHeight == -1) return -1;
        
        int rightHeight = dfsHeight(root.right);
        if(rightHeight == -1) return -1;
        
        if(Math.abs(leftHeight - rightHeight) > 1) return -1;
        return 1+Math.max(dfsHeight(root.left),dfsHeight(root.right));
    }
}

/* 
T.c -> O(N^2)
s.c -> O(H) H = height of the tree.
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        if(Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right)){
            return true;
        }
        return false;
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        
        return 1 + Math.max(height(root.left),height(root.right));
    }
}
*/