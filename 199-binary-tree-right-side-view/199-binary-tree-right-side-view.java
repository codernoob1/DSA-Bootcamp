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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        rightSide(root,1,new HashSet<>(),ans);
        return ans;
    }
    private void rightSide(TreeNode root,Integer level,HashSet<Integer> hashset,ArrayList<Integer> ans){
        if(root == null) return;
        
        if(!hashset.contains(level)){
            hashset.add(level);
            ans.add(root.val);
        }
        rightSide(root.right,level+1,hashset,ans);
        rightSide(root.left,level+1,hashset,ans);
    }
}