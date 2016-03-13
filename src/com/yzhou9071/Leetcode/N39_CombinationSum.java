package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N39_CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> retList = new ArrayList<List<Integer>>();
        List<Integer> tmpList = new ArrayList<Integer>();
        
        Arrays.sort(candidates);
        recursiveCalculative(candidates,target,retList,tmpList,0);
        
        return retList;
    }
	private void recursiveCalculative(int[] candidates, int target,
			List<List<Integer>> retList, List<Integer> tmpList, int index){
		if(target < 0)
			return ;
		if(target == 0){
			retList.add(new ArrayList<>(tmpList));
			return ;
		}
		for(int i=index;i<candidates.length;i++){
			tmpList.add(candidates[i]);
			recursiveCalculative(candidates,target-candidates[i],retList,tmpList,i);
			tmpList.remove(tmpList.size()-1);
		}
	}
}
