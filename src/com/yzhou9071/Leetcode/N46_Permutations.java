package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class N46_Permutations {
	//http://blog.csdn.net/linhuanmars/article/details/21569031
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length <= 0)
        	return res;
        
        generate(nums,res,new ArrayList<Integer>());
        
        return res;
    }
	private void generate(int[] nums, List<List<Integer>> result, List<Integer> used){
		if(used.size() >= nums.length){
			result.add(new ArrayList<Integer>(used));
			return ;
		}
		
		for(int num: nums){
			if(!used.contains(num)){
				used.add(num);
				generate(nums,result,used);
				used.remove(used.size()-1);
			}
		}
	}
}
