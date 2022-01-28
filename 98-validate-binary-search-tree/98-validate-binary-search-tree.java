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
    public boolean isValidBST(TreeNode root) {
        long[] prevVal = {-99999999999L};
        return isBST(root,prevVal);
    }
    private boolean isBST(TreeNode root,long[] prevVal){
        if(root == null) return true;
        
        boolean leftAns = isBST(root.left,prevVal);
        
        if(root.val <= prevVal[0])
            return false;
        
        prevVal[0] = root.val;
        
        boolean rightAns = isBST(root.right,prevVal);
        
        return leftAns && rightAns ;
    }
}