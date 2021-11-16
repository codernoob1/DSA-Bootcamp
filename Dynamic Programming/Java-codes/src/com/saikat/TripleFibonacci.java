package com.saikat;

import java.util.HashMap;

public class TripleFibonacci {
    public static void main(String[] args) {
        System.out.println(tripleFibo(5));
        System.out.println(tripleFiboDp(4,new HashMap<Integer,Integer>()));
    }
    public static int tripleFibo(int n){
        if (n <= 1){
            return n;
        }
        if (n == 2){
            return 1;
        }
        int a = tripleFibo(n-1);
        int b = tripleFibo(n-2);
        int c = tripleFibo(n-3);

        return a+b+c;
    }
    public static int tripleFiboDp(int n, HashMap<Integer,Integer>memo){
        if (n <= 1){
            return n;
        }
        if (n == 2){
            return 1;
        }
        int currentKey = n;

        if (memo.containsKey(currentKey)){
            return memo.get(currentKey);
        }

        int a = tripleFiboDp(n-1,memo);
        int b = tripleFiboDp(n-2,memo);
        int c = tripleFiboDp(n-3,memo);

        memo.put(currentKey,a+b+c);
        return memo.get(currentKey);
    }
}
