package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class N118_PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> retList = new ArrayList<List<Integer>>();
        if(numRows == 0)
        	return retList;
        
    	ArrayList<Integer> tmp = new ArrayList<Integer>();
    	tmp.add(1);
        retList.add(tmp);
        for(int i=1;i<numRows;i++){
        	tmp = new ArrayList<Integer>();
        	tmp.add(1);
        	for(int j=0;j<i-1;j++){
        		tmp.add(retList.get(i-1).get(j)+retList.get(i-1).get(j+1));
        	}
        	tmp.add(1);
        	retList.add(tmp);
        }
        
        return retList;
    }
}
