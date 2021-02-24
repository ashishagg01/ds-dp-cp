package com.example.dp.lcs.palindromic;

public class MinimumInsertion {

    public static void main(String[] args) {
        String x = "abca";
        minimumInsertion(x);
    }

    private static void minimumInsertion(String x) {
        System.out.println(x.length()-LPS.lps(x.toCharArray()));
    }
}
