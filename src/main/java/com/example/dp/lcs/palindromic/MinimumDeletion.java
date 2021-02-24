package com.example.dp.lcs.palindromic;


public class MinimumDeletion {

    public static void main(String[] args) {
        String x = "abca";
        minimumDeletion(x);
    }

    private static void minimumDeletion(String x) {
        System.out.println(x.length()-LPS.lps(x.toCharArray()));
    }
}
