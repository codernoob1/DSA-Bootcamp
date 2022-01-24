/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new LinkedList<>();
        Queue<Node> queue = new LinkedList<>();
        
        if(root == null) return ans;
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> subList = new ArrayList<>();
            
            for(int i=0;i<levelSize;i++){
                Node curr = queue.poll();
                subList.add(curr.val);
                for(Node child : curr.children){
                   queue.offer(child);
                }
            }
            ans.add(subList);
        }
        return ans;
    }
}