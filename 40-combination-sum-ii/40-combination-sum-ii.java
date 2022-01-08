class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        generateAllCombi(candidates,0,target,ans,new ArrayList<>());

        return ans;
    }
    private void generateAllCombi(int[] arr,int ind,int target,List<List<Integer>>ans,List<Integer> ds){
        
            if (target == 0){
                ans.add(new ArrayList<>(ds));
                return;
            }
            for(int i = ind;i<arr.length;i++){
                if (i>ind && arr[i] == arr[i-1]) continue;
                if(arr[i] > target) break;
                
                ds.add(arr[i]);
                generateAllCombi(arr,i+1,target-arr[i],ans,ds);
                ds.remove(ds.size()-1);
            }
    }
}