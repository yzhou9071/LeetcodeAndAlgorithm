package com.yzhou9071.Leetcode;

public class N334_IncreasingTripletSubsequence {
	public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3)
        	return false;
        
        int min = Integer.MAX_VALUE;
        int sndMin = Integer.MAX_VALUE;
        for(int num: nums){
        	if(num <= min)
        		min = num;
        	else if(num < sndMin)
        		sndMin = num;
        	else if(num > sndMin)
        		return true;
        }
        
        return false;
    }
}
