package com.example.dp.knapsack.zero_one;

import java.util.Arrays;

public class KnapSackMemoize {

    private static int t[][];

    public static void main(String[] args) {
        int[] wt = {2,3,4,5};
        int[] val = {10,4,5,7};
        int w=7;
        int n = wt.length;

        t = new int[n+1][w+1];

        for(int[] arr1 : t)
            Arrays.fill(arr1, -1);

        System.out.println(knapsack(wt,val,w,wt.length));
    }

    private static int knapsack(int[] wt, int[] val, int w, int n) {
        //think of the smallest valid input
        if(n==0||w==0){
            return 0;
        }

        if(t[n][w]!=-1){
            return t[n][w];
        }

        //choice diagram code
        if(wt[n-1]<=w){
            t[n][w] =  Math.max(val[n-1]+knapsack(wt,val,w-wt[n-1],n-1),knapsack(wt,val,w,n-1));
        }else{
            t[n][w] =  knapsack(wt,val,w,n-1);
        }
        return t[n][w];
    }
}
