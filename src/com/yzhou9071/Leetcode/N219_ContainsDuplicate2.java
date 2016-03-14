package com.yzhou9071.Leetcode;

import java.util.HashMap;

public class N219_ContainsDuplicate2 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length <= 0 
        		|| k <= 0)
        	return false;
        
        HashMap<Integer,Integer> numMap = new HashMap<Integer,Integer>();
        int index = 0;
        for(int num: nums){
        	if(numMap.containsKey(num) 
        			&& numMap.get(num)+k>=index)
        		return true;
        	numMap.put(num, index++);
        }
        
        return false;
    }
}
