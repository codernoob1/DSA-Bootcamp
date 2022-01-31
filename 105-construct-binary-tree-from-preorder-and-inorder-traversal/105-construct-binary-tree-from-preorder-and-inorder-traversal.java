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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> inorderMap = populateMap(inorder);
        int[] preIndex = {0};
        return constuctBST(preorder,inorderMap,0,inorder.length-1,preIndex);
        
    }
    private TreeNode constuctBST(int[] preorder,HashMap<Integer,Integer> inorderMap,int start,int end,int[] preIndex){
        if(start > end) return null;
        
        TreeNode root = new TreeNode(preorder[preIndex[0]]);
        int currentIndex = inorderMap.get(preorder[preIndex[0]]);
        preIndex[0] += 1;
        
        root.left = constuctBST(preorder,inorderMap,start,currentIndex-1,preIndex);
        root.right = constuctBST(preorder,inorderMap,currentIndex+1,end,preIndex);
        
        return root;
    } 
    private HashMap<Integer,Integer> populateMap(int[] inorder){
        HashMap<Integer,Integer> memo = new HashMap<>();
        
        for(int i =0;i<inorder.length;i++){
            memo.put(inorder[i],i);
        }
        return memo;
    }
}