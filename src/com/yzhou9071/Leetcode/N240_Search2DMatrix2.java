package com.yzhou9071.Leetcode;

public class N240_Search2DMatrix2 {
	public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix[0].length <= 0 
        		|| target < matrix[0][0]
        		|| target > matrix[matrix.length-1][matrix[0].length-1])
        	return false;
        
        return searchMatrix(matrix,0,matrix.length-1,0,matrix[0].length-1,target);
    }
	private boolean searchMatrix(int[][] matrix, int startRow, int endRow,
			int startCol, int endCol, int target){
		
		if(startRow < 0
				|| endRow >= matrix.length
				|| startCol < 0
				|| endCol >= matrix[0].length
				|| startRow > endRow
				|| startCol > endCol)
			return false;
		
		int midRow = startRow + (endRow-startRow)/2;
		int midCol = startCol + (endCol-startCol)/2;
		int midTarget = matrix[midRow][midCol];
		if(midTarget == target)
			return true;
		else if(midTarget < target)
			return searchMatrix(matrix,startRow,midRow,midCol+1,endCol,target)
					|| searchMatrix(matrix,midRow+1,endRow,startCol,midCol,target)
					|| searchMatrix(matrix,midRow+1,endRow,midCol+1,endCol,target);
		else
			return searchMatrix(matrix,startRow,midRow-1,startCol,midCol-1,target)
					|| searchMatrix(matrix,midRow,endRow,startCol,midCol-1,target)
					|| searchMatrix(matrix,startRow,midRow-1,midCol,endCol,target);
	}
}
