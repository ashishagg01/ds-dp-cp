package com.example.dp.mcm.palindrome;

import java.util.Arrays;

public class PartitioningMemoize {

    private static int t[][];
    public static void main(String[] args) {
        String str = "nitik";
        int size = str.length();
        t = new int[size+1][size+1];

        for(int[] arr1 : t)
            Arrays.fill(arr1, -1);
        System.out.println(solve(str,0,size-1));
    }

    static int solve(String str,int i,int j){
        if(i>=j)
            return 0;

        String substring = str.substring(i,j+1);
        if(new StringBuilder(substring).reverse().toString().equals(substring))
            return 0;

        if(t[i][j]!=-1){
            return t[i][j];
        }
        int min = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            //solve i to k
            //solve k+1 to j
            int left,right;
            if(t[i][k]!=-1){
                left=t[i][k];
            }else{
                left=solve(str,i,k);
                t[i][k]=left;
            }

            if(t[k+1][j]!=-1){
                right=t[k+1][j];
            }else{
                right=solve(str,k+1,j);
                t[k+1][j]=left;
            }

            int temp = 1 + left + right;
            if(temp<min)
                min=temp;
        }
        t[i][j] = min;
        return t[i][j];
    }
}
