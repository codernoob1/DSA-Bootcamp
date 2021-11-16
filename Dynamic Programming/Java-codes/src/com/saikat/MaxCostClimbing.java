package com.saikat;

import java.util.HashMap;

public class MaxCostClimbing {
    public static void main(String[] args) {
        int[] arr = {4,2,5,9};
        HashMap<Integer,Integer> box = new HashMap<>();
        int a = maxCost(arr,0,box);
        int b = maxCost(arr,1,box);
        System.out.println(Math.max(a,b));
    }
    static int maxCost(int[] cost, int currentIndex, HashMap<Integer,Integer>memo){

        if (currentIndex == cost.length){
            return 0;
        }
        if (currentIndex > cost.length){
            return -1;
        }
        int currentKey = currentIndex;

        if (memo.containsKey(currentKey)){
            return memo.get(currentKey);
        }

        int oneJump = cost[currentIndex] + maxCost(cost,currentIndex+1,memo);
        int twoJump = cost[currentIndex] +  maxCost(cost,currentIndex+2,memo);

        memo.put(currentKey,Math.max(oneJump,twoJump));
        return memo.get(currentKey);
    }
}
