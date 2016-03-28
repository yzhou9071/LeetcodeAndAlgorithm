package com.yzhou9071.Leetcode;

public class N134_GasStation {
	public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length <= 0 || cost.length <= 0)
        	return -1;
        
        int total = 0, index = 0;
        int sum = 0;
        for(int i=0;i<gas.length;i++){
        	total += gas[i] - cost[i];
        	sum += gas[i]- cost[i];
        	if(sum < 0 ){
        		sum = 0;
        		index = i + 1;
        	}
        }
        
        return total>=0?index:-1;
    }
}
