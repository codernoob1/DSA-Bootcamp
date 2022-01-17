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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return isPossible(root,targetSum,0);
    }
    private boolean isPossible(TreeNode root,int target,int currentSum){
        if(root == null) return false;
        
        if(root.left == null && root.right == null ){
            return currentSum + root.val == target;
        }
        return isPossible(root.left,target,currentSum+root.val) || isPossible(root.right,target,currentSum+root.val);
    }
}