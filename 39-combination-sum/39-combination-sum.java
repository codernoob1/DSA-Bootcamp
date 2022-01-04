class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        generateTotalSum(candidates,0,target,list,answer);
        return answer;
    }
    private void generateTotalSum(int[] nums,int currentIndex,int target,List<Integer>currentAns,List<List<Integer>> answer){
       
        if (target == 0){
            answer.add(new ArrayList<>(currentAns));
            return;
        }
        if (currentIndex >= nums.length) return;
        
        int currentVal = nums[currentIndex];
        
        if (target >= currentVal){
            currentAns.add(currentVal);
            generateTotalSum(nums,currentIndex,target-currentVal,currentAns,answer);
            currentAns.remove(currentAns.size()-1);
        }
        generateTotalSum(nums,currentIndex+1,target,currentAns,answer);
        return;
    }
}