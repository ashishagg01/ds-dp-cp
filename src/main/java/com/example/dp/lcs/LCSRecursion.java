package com.example.dp.lcs;

public class LCSRecursion {

    public static void main(String[] args) {
        String x = "abcdefghijk";
        String y = "abcdefghijkujuu";
        System.out.println(lcs(x.toCharArray(),y.toCharArray(),x.length(),y.length()));
    }

    private static int lcs(char[] x, char[] y, int n, int m) {
        //think of the smallest valid input
        if(n==0||m==0){
            return 0;
        }

        //choice diagram code
        if(x[n-1]==y[m-1]){
            return 1+lcs(x,y,n-1,m-1);
        }else{
            return Math.max(lcs(x,y,n,m-1),lcs(x,y,n-1,m));
        }
    }
}
