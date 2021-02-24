package com.example.dp.lcs;

public class LCSubString {

    private static int t[][];

    public static void main(String[] args) {
        String x = "abckx";
        String y = "abcdefghijkujuu";
        int m = x.length();
        int n = y.length();
        t = new int[m+1][n+1];

        System.out.println(lcss(x.toCharArray(),y.toCharArray(),m,n));
    }

    private static int lcss(char[] x, char[] y, int m, int n) {
        int result=0;
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                if (x[i - 1] == y[j - 1]) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] =0;
                }
                result = Integer.max(result, t[i][j]);
            }
        }
        return result;
    }
}
