package com.yzhou9071.Leetcode;

public class N289_GameOfLife {
	public void gameOfLife(int[][] board) {
        if(board.length <= 0)
        	return ;
        
        int row = board.length;
        int col = board[0].length;
        for(int i=0;i<row;i++){
        	for(int j=0;j<col;j++){
        		int status = getStatus(board,i,j,row,col);
        		if((board[i][j] == 1)
        				&& (status==2 || status==3))
        			board[i][j] = 3;
        		if((board[i][j] == 0)
        				&& (status == 3))
        			board[i][j] = 2;
        	}
        }

        for(int i=0;i<row;i++){
        	for(int j=0;j<col;j++){
        		board[i][j] >>= 1;
        	}
        }
    }
	private int getStatus(int[][] board, int dstRow, int dstCol, int row, int col){
		int status = 0;
		for(int i=Math.max(dstRow-1, 0);i<=Math.min(dstRow+1, row-1);i++){
			for(int j=Math.max(dstCol-1, 0);j<=Math.min(dstCol+1, col-1);j++)
				status += board[i][j] & 1;
		}
		status -= board[dstRow][dstCol] & 1;
		
		return status;
	}
}
