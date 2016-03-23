package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class N17_LetterCombinationsOfPhoneNumber {
    public List<String> letterCombinations(String digits) {
    	if(digits.length() <= 0)
    		return new ArrayList<String>();
    	
    	String[] keys = new String[]{"","","abc","def","ghi",
    		"jkl","mno","pqrs","tuv","wxyz"};
    	List<String> ret = new ArrayList<String>();
    	List<String> tmp;
        for(int i=0;i<digits.length();i++){
        	char[] words = keys[digits.charAt(i)-'0'].toCharArray();
        	tmp = new ArrayList<String>();
        	for(int j=0;j<words.length;j++){
        		if(ret.isEmpty())
        			ret.add("");
        		for(String str: ret)
        			tmp.add(str + words[j]);
        	}
        	ret = tmp;
        }
        
        return ret;
    }
}
