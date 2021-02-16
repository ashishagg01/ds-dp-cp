package com.example.dp.longest_common_subsequence;

public class ShortestSuperSequence {

    private static int t[][];

    public static void main(String[] args) {
        String x = "geek";
        String y = "eke";
        int m = x.length();
        int n = y.length();
        t = new int[m+1][n+1];
        System.out.println(sss(x.toCharArray(),y.toCharArray(),m,n));
    }

    private static int sss(char[] x, char[] y, int m, int n) {
        LCSTopDown.lcs(x,y,m,n,t);
        return m+n-t[m][n];
    }
}
