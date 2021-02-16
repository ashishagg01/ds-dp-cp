package com.example.dp.longest_common_subsequence;

public class MinimumInsertionDeletion {

    private static int t[][];

    public static void main(String[] args) {
        String x = "heap";
        String y = "pea";
        int m = x.length();
        int n = y.length();
        t = new int[m+1][n+1];
        minimumInsertionDeletion(x.toCharArray(),y.toCharArray(),m,n);
    }

    private static void minimumInsertionDeletion(char[] x, char[] y, int m, int n) {
        LCSTopDown.lcs(x,y,m,n,t);
        int insertion = n-t[m][n];
        int deletion = m-t[m][n];
        System.out.println("insertion:"+insertion);
        System.out.println("deletion:"+deletion);
    }
}
