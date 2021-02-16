package com.example.dp.longest_common_subsequence;

public class LCSPrint {


    public static void main(String[] args) {
        String x = "geek";
        String y = "eke";
        int m = x.length();
        int n = y.length();
        System.out.println(printlcs(x.toCharArray(),y.toCharArray(),m,n));
    }

    private static String printlcs(char[] x, char[] y,int m, int n) {
        int t[][] = new int[m+1][n+1];
        LCSTopDown.lcs(x,y,m,n,t);
        int i=m,j=n; StringBuilder s=new StringBuilder();
        while(i>0&&j>0){
            if(x[i-1]==y[j-1]){
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
        return s.reverse().toString();
    }
}
