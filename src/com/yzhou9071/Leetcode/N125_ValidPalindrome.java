package com.yzhou9071.Leetcode;

public class N125_ValidPalindrome {
	public boolean isPalindrome(String s) {
        if(s.length() <= 0)
        	return true;
        
        int low = 0, high = s.length() - 1;
        while(low < high){
        	char lowC = s.charAt(low);
        	char highC = s.charAt(high);
        	if(!isValid(lowC)){
        		++low;
        		continue;
        	}
        	if(!isValid(highC)){
        		--high;
        		continue;
        	}
        	if(!isSame(lowC, highC)){
        		return false;
        	}else{
        		++low;--high;
        	}
        }
        
        return true;
    }
	
	private boolean isValid(char target){
		if((target >= 'a' && target <= 'z')
				|| (target >= 'A' && target <= 'Z')
				|| (target >= '0' && target <= '9'))
			return true;
		return false;
	}
	
	private boolean isSame(char src, char dst){
		if((src >= '0' && src <= '9')
				|| (dst >= '0' && dst <= '9')){
			return src == dst;
		}else{
			return (src == dst)
					|| (Math.abs(src - dst) == 'a' - 'A');
		}
	}
}
