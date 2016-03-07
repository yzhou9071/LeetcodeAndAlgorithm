package com.yzhou9071.Leetcode;

import java.util.HashMap;

public class N73_SetMatrixZeroes {
	public static void setZeroes(int[][] matrix) {
        if(matrix.length <= 0)
        	return ;
        
        HashMap<String, Integer> record = new HashMap<String, Integer>();
        for(int i=0;i<matrix.length;i++){
        	for(int j=0;j<matrix[0].length;j++){
        		if(matrix[i][j] == 0){
        			record.put(i+"_"+j, j);
        		}
        	}
        }
        
        for(String key: record.keySet()){
        	int row = Integer.parseInt(key.split("_")[0]);
        	int col = record.get(key);
        	for(int i=0;i<matrix[0].length;i++)
        		matrix[row][i] = 0;
        	for(int i=0;i<matrix.length;i++)
        		matrix[i][col] = 0;
        }
    }
}
