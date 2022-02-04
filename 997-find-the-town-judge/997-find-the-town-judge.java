class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inDegree = new int[n+1];
        int[] outDegree = new int[n+1];
        
        for(int i =0;i<trust.length;i++){
            int v1 = trust[i][0];
            int v2 = trust[i][1];
            
            outDegree[v1] += 1;
            inDegree[v2] +=1;
        }
        for (int i =1;i<=n;i++){
            if(outDegree[i] == 0 && inDegree[i] == n-1) return i;
        }
        return -1;
    }
}