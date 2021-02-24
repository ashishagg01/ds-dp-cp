package com.example.dp.lcs.lrs;


public class LongestRepeatingSS {


    public static void main(String[] args) {
        String x = "AABEBCDD";
        int m = x.length();
        printlcs(x.toCharArray(),x.toCharArray(),m,m);
    }

    private static void printlcs(char[] x, char[] y,int m, int n) {
        int t[][] = new int[m+1][n+1];
        // lcs + i!=j
        lcsWithVariation(x,y,m,n,t);
        int i=m,j=n; StringBuilder s=new StringBuilder();
        while(i>0&&j>0){
            if(x[i-1]==y[j-1] && i!=j){
                s.append(x[i-1]);
                i--;j--;
            }else{
                if(t[i][j-1]>t[i-1][j]){
                    j--;
                }else{
                    i--;
                }
            }
        }
        System.out.println(s.reverse().toString());
    }

    private static int lcsWithVariation(char[] x, char[] y, int m, int n, int[][] t) {
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                if (x[i - 1] == y[j - 1] && i!=j) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i][j - 1], t[i - 1][j]);
                }
            }
        }
        return t[m][n];
    }
}
