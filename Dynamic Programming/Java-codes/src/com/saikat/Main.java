package com.saikat;

import java.util.HashMap;

public class Main {
// climbing tree
    public static void main(String[] args) {

       System.out.println(totalWays(0,4));
        System.out.println(totalWaysDp(0,4,new HashMap<>()));
    }
    static int totalWays (int currentStair, int targetStair){

        if (currentStair == targetStair){
            return 1;
        }
        if (currentStair > targetStair){
            return 0;
        }
        //there are two choice either it can jump one step or two step

        int oneStep = totalWays(currentStair+1,targetStair);

        int twoStep = totalWays(currentStair+2,targetStair);

        return oneStep + twoStep ;
    }

    static int totalWaysDp (int currentStair, int targetStair , HashMap<Integer,Integer> memo){

        if (currentStair == targetStair){
            return 1;
        }
        if (currentStair > targetStair){
            return 0;
        }

        int currentKey = currentStair ;

        if (memo.containsKey(currentKey)){
            return memo.get(currentKey);
        }

        //there are two choice either it can jump one step or two step

        int oneStep = totalWaysDp(currentStair+1,targetStair,memo);

        int twoStep = totalWaysDp(currentStair+2,targetStair,memo);

        memo.put(currentKey , oneStep + twoStep);
        return oneStep + twoStep ;
    }
}
