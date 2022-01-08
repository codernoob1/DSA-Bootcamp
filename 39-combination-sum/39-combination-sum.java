class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        generateAllCombi(candidates,target,0,ans,new ArrayList<>());
        return ans;
    }
    private void generateAllCombi(int[] arr,int target,int ind,List<List<Integer>> ans,List<Integer> ds){
        if (ind >= arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<= target){
            ds.add(arr[ind]);
            generateAllCombi(arr,target-arr[ind],ind,ans,ds);
            ds.remove(ds.size()-1);
        }
        generateAllCombi(arr,target,ind+1,ans,ds);
    }
}