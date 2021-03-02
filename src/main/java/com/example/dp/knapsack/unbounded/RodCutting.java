package com.example.dp.knapsack.unbounded;

public class RodCutting {

    public static void main(String[] args) {
        int[] length = {1,2,3,4};
        int[] price = {1,6,12,8};
        int len = 4;
        System.out.println(UNSTopDown.unbounded(length,price,len,len));
    }
}
