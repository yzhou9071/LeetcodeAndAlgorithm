package com.yzhou9071.Leetcode;

public class N345_ReverseVowelsOfString {
	public String reverseVowels(String s) {
        if(s.length() <=0 )
        	return s;
        
        int start = 0, end = s.length()-1;
        char[] sChar = s.toCharArray();
        while(start < end){
        	if(!isVowel(Character.toLowerCase(sChar[start]))){
        		++start;
        	}else if(!isVowel(Character.toLowerCase(sChar[end]))){
        		--end;
        	}else{
        		char tmp = sChar[start];
        		sChar[start] = sChar[end];
        		sChar[end] = tmp;
        		++start;--end;
        	}
        }
        return new String(sChar);
    }
	private boolean isVowel(char target){
		return target == 'a'
				|| target == 'e'
				|| target == 'i'
				|| target == 'o'
				|| target == 'u';
	}
}
