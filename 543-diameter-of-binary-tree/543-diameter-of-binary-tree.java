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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        height(root,diameter);
        return diameter[0];
    }
    int height(TreeNode root,int[] diameter){
        if(root == null) return 0;
        
        int lh = height(root.left,diameter);
        int rh = height(root.right,diameter);
        
        diameter[0] = Math.max(diameter[0],lh+rh);
        
        return 1 + Math.max(lh,rh);
    }
}

/*
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root == null) return 0;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        int lDiameter = diameterOfBinaryTree(root.left);
        int rDiameter = diameterOfBinaryTree(root.right);
        
        return Math.max(Math.max(lDiameter,rDiameter),lh+rh);
    }
    int height(TreeNode root){
        if(root == null) return 0;
        
        return 1+Math.max(height(root.left),height(root.right));
    }
}
*/