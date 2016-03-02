package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class N216_CombinationSum3 {
	public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        
        List<Integer> used = new ArrayList<Integer>();
        int sum = 0;
        int index = 1;
        generate(ret,used,k,n,sum,index);
        
        return ret;
    }
	private void generate(List<List<Integer>> ret, 
			List<Integer> used, int k, int n, int sum, int index){
		if(k == 0 && sum == n){
			ret.add(new ArrayList<Integer>(used));
			return ;
		}
		
		for(int i=index;i<=9&&sum<=n;i++){
			if(!used.contains(i)){
				used.add(i);
				generate(ret,used,k-1,n,sum+i,i+1);
				used.remove(used.size()-1);
			}
		}
	}
}
