/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null ||root == p || root == q){
            return root;
        }
        TreeNode leftAns = lowestCommonAncestor(root.left,p,q);
        TreeNode rightAns = lowestCommonAncestor(root.right,p,q);
        
        if(leftAns == null){
            return rightAns;
        }else if(rightAns == null){
            return leftAns;
        }else{
            return root;
        }
    }
}

/*
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root == null) return null;
        
        if(root.val == p.val || root.val == q.val) return root;
        
        TreeNode leftAns = lowestCommonAncestor(root.left,p,q);
        TreeNode rightAns = lowestCommonAncestor(root.right,p,q);
        
        if(leftAns != null && rightAns != null) return root;
        
        if(leftAns != null) return leftAns;
        
        if(rightAns != null) return rightAns;
        
        return null;
        
    }
}
*/