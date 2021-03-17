package com.example.dp.mcm.parenthesization;

import java.util.HashMap;
import java.util.Map;

public class EvalExpTrueMemoize {

    private static Map<String,Integer> map;
    public static void main(String[] args) {
        String str = "T^F&T";
        int size = str.length();
        map = new HashMap<>();
        System.out.println(solve(str.toCharArray(),0,size-1,true));
    }

    static int solve(char s[],int i,int j,Boolean eval){
        if(i>j)
            return 0;
        if(i==j){
            if(eval){
                return s[i]=='T'?1:0;
            }else{
                return s[i]=='F'?1:0;
            }
        }

        String key = i+" "+j+" "+eval;
        if(map.containsKey(key))
            return map.get(key);

        int ans = 0;
        for(int k=i+1; k<=j-1; k=k+2){
            int lT = solve(s,i,k-1,true);
            int lF = solve(s,i,k-1,false);
            int rT = solve(s,k+1,j,true);
            int rF = solve(s,k+1,j,false);
            if(s[k]=='|'){
                if(eval){
                    ans = ans + lT + rT;
                }else{
                    ans = ans + (lT*rF) + (lF*rT) + (lF*rF);
                }
            }else if(s[k]=='&'){
                if(eval){
                    ans = ans + (lT*rF) + (lF*rT) + (lT*rT);
                }else{
                    ans = ans + (lF*rF);
                }
            }else if(s[k]=='^'){
                if(eval){
                    ans = ans + (lT*rF) + (rF*lT);
                }else{
                    ans = ans + (lT*rT) + (rF*lF);
                }
            }
        }
        map.put(key,ans);
        return ans;
    }
}
