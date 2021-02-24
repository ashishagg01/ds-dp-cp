package com.example.dp.knapsack.zero_one;

public class KnapSackTopDown {

    public static void main(String[] args) {
        int[] wt = {2,3,4,5};
        int[] val = {10,4,5,7};
        int w=7;
        int n = wt.length;
        System.out.println(knapsack(wt,val,n,w));
    }

    private static int knapsack(int[] wt, int[] val, int n, int w) {
        int[][] t = new int[n+1][w+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < w+1; j++) {
                //initialize
                if(i==0||j==0)
                    t[i][j] = 0;
                //choice diagram code
                else if(wt[i-1]<=j)
                    t[i][j] =  Math.max(val!=null?val[i-1]+t[i-1][j-wt[i-1]]:t[i-1][j-wt[i-1]],t[i-1][j]);
                else
                    t[i][j] =  t[i-1][j];
            }
        }
        return t[n][w];
    }
}
