package com.yzhou9071.Leetcode;

public class N9_PalindromeNumber {
	public boolean isPalindrome(int x) {
		if(x < 0)
			return false;
		int target = 0, divider = 1;
		while(x / divider != 0){
			target = target*10 + x%10;
			x /= 10;
			divider *= 10;
		}
		
        return target<x*10? x==target : target/10==x;
    }
}
