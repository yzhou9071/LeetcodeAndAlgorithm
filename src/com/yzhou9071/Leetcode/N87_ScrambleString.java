package com.yzhou9071.Leetcode;

import java.util.Arrays;

public class N87_ScrambleString {
	public boolean isScramble(String s1, String s2) {
		if(s1.length() <=0 || s2.length() <= 0
        		|| s1.length() != s2.length())
        	return false;
        if(s1.equals(s2))
        	return true;
        	
        int len = s1.length();
        int[] mem = new int[26];
        Arrays.fill(mem, 0);
        for(int i=0;i<len;i++){
        	++mem[s1.charAt(i)-'a'];
        	--mem[s2.charAt(i)-'a'];
        }
        for(int num: mem){
        	if(num != 0)
        		return false;
        }
        
        for(int i=0;i<len;i++){
        	if((isScramble(s1.substring(0,i),s2.substring(0,i)) 
        		&& isScramble(s1.substring(i),s2.substring(i))) 
        			||(isScramble(s1.substring(0,i),s2.substring(len-i)))
        				&& isScramble(s1.substring(i),s2.substring(0,len-i)))
        		return true;
        }
        
        return false;
    }
}
