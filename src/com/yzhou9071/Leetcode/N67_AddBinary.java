package com.yzhou9071.Leetcode;

public class N67_AddBinary {
	public String addBinary(String a, String b) {
		int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        int carry = 0;
        
        StringBuilder ret = new StringBuilder();
        ret.setLength(Math.max(lenA, lenB)+1);
        int lenR = ret.length() - 1;
        
        while(lenA >= 0 || lenB >= 0){
        	int itemA = (lenA >= 0) ? (a.charAt(lenA--)-'0') : 0;
        	int itemB = (lenB >= 0) ? (b.charAt(lenB--)-'0') : 0;
        	
        	int curBit = itemA ^ itemB ^ carry;
        	ret.setCharAt(lenR--, (char)(curBit+'0'));
        	
        	carry = (itemA + itemB + carry) / 2;
        }
        
        if(carry == 1)
        	ret.insert(0, carry);
        
        return ret.toString();
    }
}
