package com.example.dp.lcs.scs;

import com.example.dp.lcs.LCSTopDown;

public class SCSPrint {

    public static void main(String[] args) {
        String x = "geeke";
        String y = "eke";
        int m = x.length();
        int n = y.length();
        printScs(x.toCharArray(),y.toCharArray(),m,n);
    }

    private static void printScs(char[] x, char[] y,int m, int n) {
        int t[][] = new int[m+1][n+1];
        LCSTopDown.lcs(x,y,m,n,t);
        int i=m,j=n; StringBuilder s=new StringBuilder();
        while(i>0&&j>0){
            if(x[i-1]==y[j-1]){
                s.append(x[i-1]);
                i--;j--;
            }else{
                if(t[i][j-1]>t[i-1][j]){
                    s.append(y[j-1]);
                    j--;
                }else{
                    s.append(x[i-1]);
                    i--;
                }
            }
        }
        while(i>0){
            s.append(x[i-1]);
            i--;
        }
        while(j>0){
            s.append(y[j-1]);
            j--;
        }
        System.out.println(s.reverse().toString());
    }
}
