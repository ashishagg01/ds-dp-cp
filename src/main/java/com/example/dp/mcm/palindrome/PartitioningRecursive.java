package com.example.dp.mcm.palindrome;

public class PartitioningRecursive {

    public static void main(String[] args) {
        String str = "nitik";
        int size = str.length();
        System.out.println(solve(str,0,size-1));
    }

    static int solve(String str,int i,int j){
        if(i>=j)
            return 0;
        String substring = str.substring(i,j+1);
        if(new StringBuilder(substring).reverse().toString().equals(substring))
            return 0;
        int min = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            //solve i to k
            //solve k+1 to j
            int temp = solve(str,i,k)+solve(str,k+1,j)+1;
            if(temp<min)
                min=temp;
        }
        return min;
    }
}
