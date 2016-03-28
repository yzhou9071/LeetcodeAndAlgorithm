package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class N49_GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<List<String>>();
        if(strs.length <= 0)
        	return ret;
        
        HashMap<String,List<String>> mapList = new HashMap<String,List<String>>();
        for(String tmpStr: strs){
        	char[] tmp = tmpStr.toCharArray();
        	Arrays.sort(tmp);
        	String key = String.valueOf(tmp);
        	List<String> tmpList = mapList.get(key);
        	if(tmpList == null)
        		tmpList = new ArrayList<String>();
        	tmpList.add(tmpStr);
        	mapList.put(key, tmpList);
        }
        
        for(List<String> tmpList: mapList.values()){
        	Collections.sort(tmpList);
        	ret.add(tmpList);
        }
        
        return ret;
    }
}
