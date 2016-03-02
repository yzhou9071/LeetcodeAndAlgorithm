package com.yzhou9071.Leetcode;

public class N137_SingleNumber2 {
	public int singleNumber(int[] nums) {
		if(nums.length <= 0) 
        	return 0;
            
        int tmp[] = new int[32];
		int ret = 0;
		for(int i=0;i<32;i++){
			for(int j=0;j<nums.length;j++){
				if(((nums[j] >> i) & 1) == 1)
					tmp[i]++;
			}
			ret |= ((tmp[i] % 3) << i);
		}
		
		return ret;
    }
}
