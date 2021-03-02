package com.example.dp.knapsack.zero_one.variations;

public class EqualSum {

    public static void main(String[] args) {
        int[] arr = {1,5,11,5};
        int n = arr.length;
        System.out.println(eqs(arr,n));
    }

    private static boolean eqs(int[] arr, int n) {
        int s = 0;
        for (int i:arr ) {
            s=s+i;
        }
        if(s%2!=0){
            return false;
        }
        Boolean[][] t = new Boolean[n+1][s/2+1];
        return SubsetSum.ssm(arr,n,s/2, t);
    }
}
