package com.yzhou9071.Leetcode;

public class N58_LengthOfLastWord {
	public int lengthOfLastWord(String s) {
        if(s.length() <= 0
        		|| s.trim().length() == 0)
        	return 0;
        return s.trim().length()-1-s.trim().lastIndexOf(' ');
    }
}
