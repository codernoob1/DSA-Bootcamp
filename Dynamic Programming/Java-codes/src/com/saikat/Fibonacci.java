package com.saikat;

import java.util.HashMap;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(nthFibo(4));
        System.out.println(nthFiboDp(4,new HashMap<Integer,Integer>()));
    }
    public static int nthFibo(int n){

        if (n <= 1){
            return n;
        }
        int a = nthFibo(n-1);
        int b = nthFibo(n-2);

        return a+b;
    }
    public static int nthFiboDp(int n, HashMap<Integer,Integer>memo){
        if (n<=1){
            return n;
        }
        int currentKey = n;

        if (memo.containsKey(currentKey)){
            return memo.get(currentKey);
        }
        int a = nthFiboDp(n-1,memo);
        int b = nthFiboDp(n-2,memo);

        memo.put(currentKey,a+b);
        return memo.get(currentKey);
    }
}
