package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N90_Subsets2 {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> retList = new ArrayList<List<Integer>>();
		List<Integer> tmpList;
		int listSize = 0;

		for (int num : nums) {
			listSize = retList.size();
			if(listSize == 0){
				tmpList = new ArrayList<>();
				tmpList.add(num);
				retList.add(tmpList);
			}else{
				for (int i = 0; i < listSize; i++) {
					tmpList = new ArrayList<>(retList.get(i));
					tmpList.add(num);
					if (!retList.contains(tmpList))
						retList.add(tmpList);
				}
				tmpList = new ArrayList<>();
				tmpList.add(num);
				if(!retList.contains(tmpList))
					retList.add(tmpList);
			}
		}
		retList.add(new ArrayList<Integer>());
		return retList;
	}
}
