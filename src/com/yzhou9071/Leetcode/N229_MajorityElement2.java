package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class N229_MajorityElement2 {
	public List<Integer> majorityElement(int[] nums) {
		List<Integer> ret = new ArrayList<Integer>();
        if(nums.length <= 0)
        	return ret;
        
        int m = 0, n = 0;
        int mNum = 0, nNum = 0;
        for(int num: nums){
        	if(num == m) ++mNum;
        	else if(num == n) ++nNum;
        	else if(mNum == 0){
        		m = num;
        		++mNum;
        	}else if(nNum == 0){
        		n = num;
        		++nNum;
        	}else{
        		--mNum;
        		--nNum;
        	}
        }
        
        mNum = nNum = 0;
        for(int num: nums){
        	if(num == m) ++mNum;
        	else if(num == n) ++nNum;
        }
        
        if(mNum > nums.length/3) ret.add(m);
        if(nNum > nums.length/3) ret.add(n);
        return ret;
    }
}
