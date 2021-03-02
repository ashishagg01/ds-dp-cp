package com.example.dp.knapsack.unbounded;

public class CoinChangeMinCoins {

    public static void main(String[] args) {
        int[] coin = {1,2,3};
        int sum = 5;
        System.out.println(minCoin(coin,coin.length,sum));
    }

    public static int minCoin(int[] coin, int n, int w) {
        int[][] t = new int[n+1][w+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < w+1; j++) {
                //initialize
                if(i==0)
                    t[i][j] = Integer.MAX_VALUE-1;
                else if(j==0)
                    t[i][j] = 0;
                else if(i==1)
                    t[i][j] = j%coin[i-1]==0?j/coin[i-1]:Integer.MAX_VALUE-1;
                    //choice diagram code
                else if(coin[i-1]<=j)
                    t[i][j] =  Math.min(1+t[i][j-coin[i-1]] , t[i-1][j]);
                else
                    t[i][j] =  t[i-1][j];
            }
        }
        return t[n][w];
    }


}
