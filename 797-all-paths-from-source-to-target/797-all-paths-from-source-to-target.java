class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
       List<List<Integer>> answer = new ArrayList<>();
        int n = graph.length;
        
        boolean[] visited = new boolean[n];
        sourceToTarget(graph,0,visited,n,new ArrayList<>(),answer);
        return answer;
    }
    private void sourceToTarget(int[][] graph,int currentNode,boolean[] visited,int n,List<Integer>currentPath,List<List<Integer>> answer){
        if(currentNode == n-1){
            currentPath.add(currentNode);
            answer.add(new ArrayList<>(currentPath));
            currentPath.remove(currentPath.size()-1);
            return;
        }
        if(visited[currentNode] == true)
            return;
        
        visited[currentNode] = true;
        currentPath.add(currentNode);
        
        for(Integer neighbours:graph[currentNode])
            sourceToTarget(graph,neighbours,visited,n,currentPath,answer);
        
        visited[currentNode] = false;
        currentPath.remove(currentPath.size()-1);
        return;
    }
}