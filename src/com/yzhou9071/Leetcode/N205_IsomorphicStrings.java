package com.yzhou9071.Leetcode;

import java.util.HashMap;

public class N205_IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
        	return false;
        HashMap<Character,Character> mem = new HashMap<Character,Character>();
        char sChar;
        for(int i=0;i<s.length();i++){
        	sChar = s.charAt(i);
        	if(mem.containsKey(sChar)){
        		if(mem.get(sChar) != t.charAt(i))
        			return false;
        	}else{
        		if(mem.containsValue(t.charAt(i)))
        			return false;
        		mem.put(sChar, t.charAt(i));
        	}
        }
        return true;
    }
}
