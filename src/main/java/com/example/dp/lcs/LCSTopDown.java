package com.example.dp.lcs;


public class LCSTopDown {

    public static void main(String[] args) {
        String x = "geek";
        String y = "eke";
        int m = x.length();
        int n = y.length();
        int t[][] = new int[m+1][n+1];

        System.out.println(lcs(x.toCharArray(),y.toCharArray(),m,n,t));
    }

    public static int lcs(char[] x, char[] y, int m, int n, int[][] t) {
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                if (x[i - 1] == y[j - 1]) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i][j - 1], t[i - 1][j]);
                }
            }
        }
        return t[m][n];
    }
}
