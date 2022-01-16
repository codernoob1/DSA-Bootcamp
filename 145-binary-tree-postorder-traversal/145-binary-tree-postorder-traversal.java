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
/* This is using Stack */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> ds = new Stack<>();
        
        if(root == null) return ans;
        ds.push(root);
        
        while(!ds.empty()){
            TreeNode currentNode = ds.pop();
            ans.add(currentNode.val);
            
            if(currentNode.left != null){
                ds.push(currentNode.left);
            }
            if(currentNode.right != null){
                ds.push(currentNode.right);
            }
        }
        Collections.reverse(ans);
        return ans;
    }

}
/* This is using recursion */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postOrder(root,ans);
        return ans;
    }
    private void postOrder(TreeNode root,List<Integer> ans){
        if (root == null){
            return;
        }
        postOrder(root.left,ans);
        postOrder(root.right,ans);
        ans.add(root.val);
    }
}
