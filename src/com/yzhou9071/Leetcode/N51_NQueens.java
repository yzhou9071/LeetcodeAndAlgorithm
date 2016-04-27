package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class N51_NQueens {
	public List<List<String>> solveNQueens(int n) {
        List<List<String>> ret = new ArrayList<List<String>>();
        if(n <= 0)
        	return ret;
        
        recursiveCheck(ret,n,0,new int[n]);
        
        return ret;
    }
	private void recursiveCheck(List<List<String>> ret, int n,
			int row, int[] rowMem){
		if(row == n){
			ArrayList<String> tmpRet = new ArrayList<String>();
			for(int i=0;i<n;i++){
				StringBuffer tmp = new StringBuffer();
				for(int j=0;j<n;j++){
					if(rowMem[i] == j)
						tmp.append("Q");
					else
						tmp.append(".");	
				}
				tmpRet.add(tmp.toString());
			}
			
			ret.add(tmpRet);
			return ;
		}
		
		for(int i=0;i<n;i++){
			rowMem[row] = i;
			if(isValid(row,rowMem))
				recursiveCheck(ret,n,row+1,rowMem);
		}
	}
	private boolean isValid(int row, int[] rowMem){
		for(int i=0;i<row;i++){
			if(rowMem[row] == rowMem[i]
					|| (row-i) == Math.abs(rowMem[row]-rowMem[i]))
					return false;
		}
		return true;
	}
}
