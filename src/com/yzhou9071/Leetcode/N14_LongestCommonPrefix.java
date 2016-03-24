package com.yzhou9071.Leetcode;

public class N14_LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        if(strs.length <= 0)
        	return "";
        int len = strs.length;
        StringBuffer strBuffer = new StringBuffer(strs[0]);
        for(int i=1;i<len;i++){
        	while(!strs[i].startsWith(strBuffer.toString()))
        		strBuffer.deleteCharAt(strBuffer.length()-1);
        }
        
        return strBuffer.toString();
    }
}
