package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N40_CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if(candidates.length <= 0
        		|| target <= 0)
        	return ret;
        
        Arrays.sort(candidates);
        backTracking(candidates,0,ret,target,new ArrayList<Integer>());
        return ret;
    }
    private void backTracking(int[] candidates, int pos,
    		List<List<Integer>> ret, int target, List<Integer> tmp){
    	if(target == 0){
    		ret.add(new ArrayList<Integer>(tmp));
    		return ;
    	}
    	
    	for(int i=pos;i<candidates.length;i++){
    		if(candidates[i] <= target
    				&& (i==pos || candidates[i]!=candidates[i-1])){
    			tmp.add(candidates[i]);
    			backTracking(candidates,i+1,ret,target-candidates[i],tmp);
    			tmp.remove(tmp.size()-1);
    		}
    	}
    }
}
