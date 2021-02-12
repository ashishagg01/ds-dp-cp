package com.example.dp.longest_common_subsequence;


public class LCSTopDown {
    private static int t[][];

    public static void main(String[] args) {
        String x = "abckx";
        String y = "abcdefghijkujuu";
        int m = x.length();
        int n = y.length();
        t = new int[m+1][n+1];

        System.out.println(lcs(x.toCharArray(),y.toCharArray(),m,n));
    }

    private static int lcs(char[] x, char[] y, int m, int n) {
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
