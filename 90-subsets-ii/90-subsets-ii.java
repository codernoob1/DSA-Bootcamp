class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        
        generateAllSubsets(nums,0,new ArrayList<>(),ans);
        return ans;
        
        
    }
    private void generateAllSubsets(int[] nums,int ind,List<Integer> ds, List<List<Integer>> ans){
        
        ans.add(new ArrayList(ds));
        
        for(int i =ind;i<nums.length;i++){
            if (i != ind && nums[i] == nums[i-1])continue;
            ds.add(nums[i]);
            generateAllSubsets(nums,i+1,ds,ans);
            ds.remove(ds.size()-1);
        }
        
    }
}