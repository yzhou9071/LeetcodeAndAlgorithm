package com.yzhou9071.Leetcode;

public class N36_ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
        if(board.length <= 0)
        	return false;
        for(int row=0;row<board.length;row++){
        	for(int col=0;col<board.length;col++){
        		if(board[row][col] != '.' 
        				&& !isValid(row,col,board))
        			return false;
        	}
        }
		return true;
    }
	private boolean isValid(int row, int col,char[][] board){
		for(int i=0;i<board.length;i++){
			if(i!=row && board[i][col]==board[row][col])
				return false;
		}
		for(int i=0;i<board.length;i++){
			if(i!=col && board[row][i]==board[row][col])
				return false;
		}
		int rowIndex = 3 * (row / 3);
		int colIndex = 3 * (col / 3);
		for(int i=rowIndex;i<rowIndex+3;i++){
			for(int j=colIndex;j<colIndex+3;j++){
				if((i!=row && j!=col) && board[i][j]==board[row][col])
					return false;
			}
		}
		return true;
	}
}
