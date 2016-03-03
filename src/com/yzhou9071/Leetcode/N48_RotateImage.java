package com.yzhou9071.Leetcode;

public class N48_RotateImage {
	public void rotate(int[][] matrix) {
		int len = matrix.length;
        for(int i=0;i<len;i++){
        	for(int j=i+1;j<len;++j)
        		swapMatrix(matrix,i,j);
        	for(int k=0;k<len/2;k++)
        		swapRow(matrix,i,k,len);
        }
    }
	private void swapRow(int[][] matrix, int row, int col, int n){
		int tmp = matrix[row][col];
		matrix[row][col] = matrix[row][n-1-col];
		matrix[row][n-1-col] = tmp;
	}
	private void swapMatrix(int[][] matrix, int row, int col){
		int tmp = matrix[row][col];
		matrix[row][col] = matrix[col][row];
		matrix[col][row] = tmp;
	}
}
