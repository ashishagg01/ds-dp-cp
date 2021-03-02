package com.example.dp.knapsack.zero_one.variations;

public class CountSubsetSum {

    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,10};
        int s=10;
        int n = arr.length;
        Integer[][] t = new Integer[n+1][s+1];
        System.out.println(ssm(arr,n,s,t));
    }

    public static Integer ssm(int[] arr, int n, int s, Integer[][] t) {
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < s+1; j++) {
                if(j==0){
                    t[i][j] = 1;
                }else if(i==0){
                    t[i][j] = 0;
                }else if(arr[i-1]<=j)
                    t[i][j] =  t[i-1][j-arr[i-1]] + t[i-1][j];
                else
                    t[i][j] =  t[i-1][j];
            }
        }
        return t[n][s];
    }
}
