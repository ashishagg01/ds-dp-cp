package com.example.dp.knapsack.unbounded;

public class CoinChangeMaxWays {

    public static void main(String[] args) {
        int[] coin = {1,2,3};
        int sum = 5;
        System.out.println(coin(coin,coin.length,sum));
    }

    public static int coin(int[] coin, int n, int w) {
        int[][] t = new int[n+1][w+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < w+1; j++) {
                //initialize
                if(j==0)
                    t[i][j] = 1;
                else if(i==0)
                    t[i][j] = 0;
                    //choice diagram code
                else if(coin[i-1]<=j)
                    t[i][j] =  t[i][j-coin[i-1]] + t[i-1][j];
                else
                    t[i][j] =  t[i-1][j];
            }
        }
        return t[n][w];
    }
}
