package com.yzhou9071.Leetcode;

import java.util.HashMap;

public class N290_WordPattern {
	public boolean wordPattern(String pattern, String str) {
        String[] strArr = str.split(" ");
        if(pattern.length()<=0
        		|| str.length()<=0
        		|| pattern.length()!=strArr.length)
        	return false;
        
        HashMap<Character,String> mem = new HashMap<Character,String>();
        for(int i=0;i<pattern.length();i++){
        	if(mem.containsKey(pattern.charAt(i))){
        		 if(!mem.get(pattern.charAt(i)).equals(strArr[i]))
        			 return false;
        	}else{
        		if(mem.containsValue(strArr[i]))
        			return false;
        		mem.put(pattern.charAt(i), strArr[i]);
        	}
        } 
        
        return true;
    }
}
