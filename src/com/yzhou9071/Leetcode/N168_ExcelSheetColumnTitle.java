package com.yzhou9071.Leetcode;

public class N168_ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
        StringBuilder ret = new StringBuilder();
        
        while(n != 0){
        	ret.append((char)('A' + (n-1)%26));
        	n = (n-1)/26;
        }
        
        return ret.reverse().toString();
    }
}
