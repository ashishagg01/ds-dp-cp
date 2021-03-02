package com.example.dp.knapsack.zero_one.variations;

public class CountSSGivenDiff {

    public static void main(String[] args) {
        int[] arr = {1,1,2,3};
        int diff=1;
        int n = arr.length;
        System.out.println(css(arr,n,diff));
    }

    public static int css(int[] arr, int n,int diff) {
        int sum = 0;
        for (int i:arr ) {
            sum=sum+i;
        }
        int s = (sum+diff)/2;
        Integer[][] t = new Integer[n+1][s+1];
        return CountSubsetSum.ssm(arr,n,s,t);
    }
}
