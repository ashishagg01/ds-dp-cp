package com.example.dp.mcm;

import java.util.Arrays;

public class MCMMemoization {

    private static int t[][];
    public static void main(String[] args) {
        int arr[] = {40,20,30,10,30};
        int n = arr.length;
        t = new int[n+1][n+1];

        for(int[] arr1 : t)
            Arrays.fill(arr1, -1);
        System.out.println(solve(arr,1,n-1));
    }

    static int solve(int arr[],int i,int j){
        if(i>=j)
            return 0;

        if(t[i][j]!=-1){
            return t[i][j];
        }
        int min = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            //solve i to k
            //solve k+1 to j
            int temp = solve(arr,i,k)+solve(arr,k+1,j)+arr[i-1]*arr[k]*arr[j];
            if(temp<min)
                min=temp;
        }
        t[i][j]=min;
        return t[i][j];
    }
}
