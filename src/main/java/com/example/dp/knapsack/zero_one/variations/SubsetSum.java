package com.example.dp.knapsack.zero_one.variations;

public class SubsetSum {

    public static void main(String[] args) {
        int[] arr = {2,3,7,8,10};
        int s=10;
        int n = arr.length;
        Boolean[][] t = new Boolean[n+1][s+1];
        System.out.println(ssm(arr,n,s,t));
    }

    public static Boolean ssm(int[] arr, int n, int s, Boolean[][] t) {

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < s+1; j++) {
                if(j==0){
                    t[i][j] = Boolean.TRUE;
                }else if(i==0){
                    t[i][j] = Boolean.FALSE;
                }else if(arr[i-1]<=j)
                    t[i][j] =  t[i-1][j-arr[i-1]] || t[i-1][j];
                else
                    t[i][j] =  t[i-1][j];
            }
        }
        return t[n][s];
    }
}
