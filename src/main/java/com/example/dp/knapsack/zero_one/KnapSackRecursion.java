package com.example.dp.knapsack.zero_one;

public class KnapSackRecursion {

    public static void main(String[] args) {
        int[] wt = {2,3,4,5};
        int[] val = {10,4,5,7};
        int w=7;

        System.out.println(knapsack(wt,val,w,wt.length));
    }

    private static int knapsack(int[] wt, int[] val, int w, int n) {
        //think of the smallest valid input
        if(n==0||w==0){
            return 0;
        }

        //choice diagram code
        if(wt[n-1]<=w){
            return Math.max(val[n-1]+knapsack(wt,val,w-wt[n-1],n-1),knapsack(wt,val,w,n-1));
        }else{
            return knapsack(wt,val,w,n-1);
        }
    }
}
