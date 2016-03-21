package com.yzhou9071.Leetcode;

public class N115_DistinctSubsequences {
	public int numDistinct(String s, String t) {
        if(t.length()<=0)
        	return 1;
        else if(s.length()<=0)
        	return 0;
        
        int[][] dp = new int[t.length()+1][s.length()+1];
        dp[0][0] = 1;
        for(int i=1;i<=t.length();i++)
        	dp[i][0] = 0;
        for(int i=1;i<=s.length();i++)
        	dp[0][i] = 1;
        for(int i=1;i<=t.length();i++){
        	for(int j=1;j<=s.length();j++){
        		dp[i][j] = dp[i][j-1];
        		if(s.charAt(j-1)==t.charAt(i-1))
        			dp[i][j] += dp[i-1][j-1];
        	}
        }
        
        return dp[t.length()][s.length()];
    }
}
