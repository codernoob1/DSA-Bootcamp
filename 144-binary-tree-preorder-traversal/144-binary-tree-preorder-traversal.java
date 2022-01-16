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
/*This is using stack*/
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> ds = new Stack<>();
        
        if(root == null) return ans;
        
        ds.push(root);
        TreeNode currentNode = null;
        while(!ds.empty()){
           currentNode =  ds.pop();
            ans.add(currentNode.val);
            
            if(currentNode.right != null){
                ds.push(currentNode.right);
            }
            if(currentNode.left != null){
                ds.push(currentNode.left);
            }
        }
        return ans;
    }

}

/*This is using recursion*/
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> ans = new ArrayList<>();
       preorder(root,ans);
        return ans;
    }
    private void preorder(TreeNode root,List<Integer> ans){
        if (root == null){
            return;
        }
        ans.add(root.val);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }
}
*/
