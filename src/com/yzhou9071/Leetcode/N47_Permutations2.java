package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N47_Permutations2 {
	//http://blog.csdn.net/linhuanmars/article/details/21570835
	public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if(nums.length <= 0)
        	return ret;
        
        Arrays.sort(nums);
        helper(ret,nums,new boolean[nums.length],new ArrayList<Integer>());
        
        return ret;
    }
	private void helper(List<List<Integer>> ret, int[] nums, 
			boolean[] used, ArrayList<Integer> tmp){
		if(tmp.size() == nums.length){
			ret.add(new ArrayList<Integer>(tmp));
			return ;
		}
		
		for(int i=0;i<nums.length;i++){
			if(i>0 
				&& !used[i-1]
				&& nums[i]==nums[i-1])
				continue;
			if(!used[i]){
				used[i] = true;
				tmp.add(nums[i]);
				helper(ret,nums,used,tmp);
				tmp.remove(tmp.size()-1);
				used[i] = false;
			}
			
		}
	}
}
