package com.saikat;

import java.util.HashMap;

public class RobORNotRob {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(maxMoney(nums,0));
        System.out.println(maxMoneyDp(nums,0,new HashMap<Integer,Integer>()));
    }
    public static int maxMoney(int[] nums,int currentIndex){

        if (currentIndex >= nums.length){
            return 0;
        }
        int rob = nums[currentIndex] + maxMoney(nums,currentIndex+2);
        int noRob = maxMoney(nums,currentIndex+1);

        return Math.max(rob,noRob);
    }
    public static int maxMoneyDp(int[] nums, int currentIndex, HashMap<Integer,Integer> memo){

        if (currentIndex >= nums.length){
            return 0;
        }
        int currentKey = currentIndex;

        if (memo.containsKey(currentKey)){
            return memo.get(currentKey);
        }

        int rob = nums[currentIndex] + maxMoney(nums,currentIndex+2);
        int noRob = maxMoney(nums,currentIndex+1);
        memo.put(currentKey,Math.max(rob,noRob));
        return memo.get(currentKey);
    }
}
