package com.example.dp.lcs;

import java.util.Arrays;

public class LCSMemoize {
    private static int t[][];

    public static void main(String[] args) {
        String x = "zxcccc";
        String y = "abcdefghijkujuu";
        int m = x.length();
        int n = y.length();
        t = new int[m+1][n+1];

        for(int[] arr1 : t)
            Arrays.fill(arr1, -1);

        System.out.println(lcs(x.toCharArray(),y.toCharArray(),m,n));
    }

    private static int lcs(char[] x, char[] y, int m, int n) {
        if(m==0||n==0){
            t[m][n]= 0;
        }

        if(t[m][n]!=-1){
            return t[m][n];
        }

        if(x[m-1]==y[n-1]){
            t[m][n]= 1+lcs(x,y,m-1,n-1);
        }else{
            t[m][n]= Math.max(lcs(x,y,m,n-1),lcs(x,y,m-1,n));
        }

        return t[m][n];
    }
}
