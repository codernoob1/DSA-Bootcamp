class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> powerSet = new ArrayList<>();
        generateAllSubsets(nums,0,new ArrayList<>(),powerSet);
        return powerSet;
    }
    private void generateAllSubsets(int[] nums,int currentIndex,List<Integer>currentSubSet,List<List<Integer>> powerSet){
       
        if(currentIndex >= nums.length){
            powerSet.add(new ArrayList<>(currentSubSet));
            return;
        }
        currentSubSet.add(nums[currentIndex]);
        generateAllSubsets(nums,currentIndex+1,currentSubSet,powerSet);
        
        currentSubSet.remove(currentSubSet.size()-1);
        generateAllSubsets(nums,currentIndex+1,currentSubSet,powerSet);
        

    }
    /*
    powerSet.add(new ArrayList<>(currentSubSet));
                for (int i = currentIndex;i<nums.length;i++){
                currentSubSet.add(nums[i]);
                generateAllSubsets(nums,i+1,currentSubSet,powerSet);
                currentSubSet.remove(currentSubSet.size()-1);
            }
    
    */
}