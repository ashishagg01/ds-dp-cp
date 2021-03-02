package com.example.dp.knapsack.zero_one.variations;

public class TargetSum {

    public static void main(String[] args) {
        //allowed signs - and +
        int[] arr = {1,1,2,3};
        int sum=1;
        int n = arr.length;
        System.out.println(CountSSGivenDiff.css(arr,n,sum));
    }
}
