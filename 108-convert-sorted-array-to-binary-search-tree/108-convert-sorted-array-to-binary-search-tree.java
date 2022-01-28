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
    public TreeNode sortedArrayToBST(int[] nums) {
        return arrayToBST(nums,0,nums.length-1);
    }
    private TreeNode arrayToBST(int[] nums,int start,int end){
        if(start > end){
            return null;
        }
        int mid = start+(end-start)/2;
        TreeNode newNode = new TreeNode(nums[mid]);
        
        newNode.left = arrayToBST(nums,start,mid-1);
        newNode.right = arrayToBST(nums,mid+1,end);
        
        return newNode;
    }
}