package com.example.dp.lcs.palindromic;

import com.example.dp.lcs.LCSTopDown;

public class LPS {

    private static int t[][];

    public static void main(String[] args) {
        String x = "agbcba";
        System.out.println(lps(x.toCharArray()));
    }

    public static int lps(char[] x){
        char[] y = reverse(x);
        int m = x.length;
        int n = y.length;
        t = new int[m+1][n+1];
        LCSTopDown.lcs(x,y,m,n,t);
        return t[m][n];
    }

    private static char[] reverse(char[] x) {
        StringBuilder builder = new StringBuilder();
        for(char c:x){
            builder.append(c);
        }
        return builder.reverse().toString().toCharArray();
    }
}
