package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N78_Subsets {
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> retList = new ArrayList<List<Integer>>();
		if(nums.length <= 0)
			return retList;
        
		Arrays.sort(nums);
		for(int num: nums){
			if(retList.isEmpty())
				retList.add(new ArrayList(Arrays.asList(num)));
			else{
				int size = retList.size();
				for(int i=0;i<size;i++){
					List<Integer> tmpList = new ArrayList<>(retList.get(i));
					tmpList.add(num);
					retList.add(tmpList);
				}
				retList.add(new ArrayList(Arrays.asList(num)));
			}
		}

		retList.add(new ArrayList());
		return retList;
    }
}
