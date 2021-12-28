class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int answer = 0;
        int prefixSum = 0;
       
        HashMap<Integer,Integer> memo =new HashMap<>();
         memo.put(prefixSum,1);
        
        for (int i =0;i<nums.length;i++){
            prefixSum += nums[i];
            prefixSum=((prefixSum%k)+k)%k;
            
            if (memo.containsKey(prefixSum)){
                answer += memo.get(prefixSum);
                memo.put(prefixSum,memo.get(prefixSum)+1);
            }else{
                memo.put(prefixSum,1);
            }
        }
        return answer;
    }
}