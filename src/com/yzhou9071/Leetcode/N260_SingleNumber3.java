package com.yzhou9071.Leetcode;

public class N260_SingleNumber3 {
	//https://leetcode.com/discuss/76099/a-summary-of-java-solutions
	//http://bookshadow.com/weblog/2015/08/17/leetcode-single-number-iii/
	public int[] singleNumber(int[] nums) {
        int[] ret = {0,0};
        int xorRet = 0;
        
        for(int i=0;i<nums.length;i++){
        	xorRet ^= nums[i];
        }
        
        int lowBit = xorRet & -xorRet;
        for(int i=0;i<nums.length;i++){
        	if((i & lowBit) == 0)
        		ret[0] ^= nums[i];
        	else
        		ret[1] ^= nums[i];
        }
        
        return ret;
    }
}
