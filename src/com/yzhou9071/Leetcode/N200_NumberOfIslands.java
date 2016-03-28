package com.yzhou9071.Leetcode;

public class N200_NumberOfIslands {
    public int numIslands(char[][] grid) {
        if(grid.length <= 0 
        		|| grid[0].length <= 0)
        	return 0;
        
        int islandNum = 0;
        int rowLen = grid.length, colLen = grid[0].length;
        for(int i=0;i<rowLen;i++){
        	for(int j=0;j<colLen;j++){
        		if(grid[i][j] == '1'){
        			++islandNum;
        			dfsSearch(i,j,grid,rowLen,colLen);
        		}
        	}
        }
        return islandNum;
    }
    private void dfsSearch(int row, int col, char[][] grid,
    		int rowLen, int colLen){
    	if(row >= 0 && row < rowLen
    			&& col >= 0 && col < colLen
    			&& grid[row][col] == '1'){
    		grid[row][col] = '0';
    		dfsSearch(row,col+1,grid,rowLen,colLen);
    		dfsSearch(row,col-1,grid,rowLen,colLen);
    		dfsSearch(row+1,col,grid,rowLen,colLen);
    		dfsSearch(row-1,col,grid,rowLen,colLen);
    	}
    }
}
