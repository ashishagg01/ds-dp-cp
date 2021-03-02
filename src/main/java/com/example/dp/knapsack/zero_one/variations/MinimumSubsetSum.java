package com.example.dp.knapsack.zero_one.variations;

public class MinimumSubsetSum {

    public static void main(String[] args) {
        int[] arr = {1,6,11,5};
        int n = arr.length;
        System.out.println(mss(arr,n));
    }

    private static int mss(int[] arr, int n) {
        int s = 0;
        for (int i:arr ) {
            s=s+i;
        }
        Boolean[][] t = new Boolean[n+1][s+1];
        SubsetSum.ssm(arr,n,s, t);
        int mn = Integer.MAX_VALUE;
        int range = s%2!=0?s/2+1:s/2;
        for (int i = 0; i < range ; i++) {
            if(t[n][i]){
                mn = Math.min(mn,s-2*i);
            }
        }
        return mn;
    }
}
