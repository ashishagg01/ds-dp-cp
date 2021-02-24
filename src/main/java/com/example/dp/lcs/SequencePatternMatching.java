package com.example.dp.lcs;

public class SequencePatternMatching {

    public static void main(String[] args) {
        String x = "geeke";
        String y = "eke";
        int m = x.length();
        int n = y.length();
        printlcs(x.toCharArray(),y.toCharArray(),m,n);
    }

    private static void printlcs(char[] x, char[] y,int m, int n) {
        int t[][] = new int[m+1][n+1];
        LCSTopDown.lcs(x,y,m,n,t);
        System.out.println(n==t[m][n]);
    }
}
