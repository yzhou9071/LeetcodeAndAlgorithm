package com.yzhou9071.Leetcode;

import java.util.HashMap;
import java.util.Stack;

public class N20_ValidParentheses {
	public boolean isValid(String s) {
        if(s.length() <= 0)
        	return true;
        
        HashMap<Character,Character> mem = new HashMap<Character,Character>(){{
        	put('{','}');put('(',')');put('[',']');
        }};
        Stack<Character> tmp = new Stack<Character>();
        for(int i=0;i<s.length();i++){
        	char curChar = s.charAt(i);
        	if(curChar == '(' 
        			|| curChar == '{' 
        			|| curChar == '['){
        		tmp.push(curChar);
        	}else if(curChar == ')' 
        			|| curChar == '}' 
        			|| curChar == ']'){
        		if(tmp.size() <= 0
        				|| mem.get(tmp.pop()) != curChar)
        			return false;
        	}
        }
        
        if(tmp.size() != 0)
            return false;
        return true;
    }
}
