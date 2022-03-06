class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int num:arr){
            ans.put(num,ans.getOrDefault(num,0)+1);
        }
        HashSet<Integer> unique_vals = new HashSet(ans.values());
        return ans.size() == unique_vals.size();
    }
}