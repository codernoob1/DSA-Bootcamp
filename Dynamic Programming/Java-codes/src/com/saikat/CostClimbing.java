package com.saikat;

import java.util.HashMap;

public class CostClimbing {
    public static void main(String[] args) {
        int[] cost = {4,2,5,9};
        HashMap<Integer,Integer> map = new HashMap<>();
        int a = minCostDp(cost,0,map);
        int b = minCostDp(cost,1,map);
        System.out.println(Math.min(a,b));
    }
    static int minCost(int[] cost , int currentIndex){

        if (currentIndex == cost.length){
            return 0;
        }

        if (currentIndex > cost.length ){
            return 1000;
        }

        int oneJump = cost[currentIndex] + minCost(cost, currentIndex+1);
        int twoJump = cost[currentIndex] + minCost(cost,currentIndex+2);

        return Math.min(oneJump,twoJump) ;
    }
    static int minCostDp(int[] cost , int currentIndex , HashMap<Integer,Integer> memo){

        if (currentIndex == cost.length){
            return 0;
        }

        if (currentIndex > cost.length ){
            return 1000;
        }
        int currentKey = currentIndex ;

        if (memo.containsKey(currentKey)){
            return memo.get(currentKey);
        }
        int oneJump = cost[currentIndex] + minCostDp(cost, currentIndex+1,memo);
        int twoJump = cost[currentIndex] + minCostDp(cost,currentIndex+2,memo);

        memo.put(currentKey,Math.min(oneJump,twoJump));
        return memo.get(currentKey);
    }

}
