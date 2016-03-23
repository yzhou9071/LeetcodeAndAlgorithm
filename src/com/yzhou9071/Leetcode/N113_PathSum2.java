package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class N113_PathSum2 {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> retList = new ArrayList<List<Integer>>();
		searchSumDfs(retList,root,sum,new ArrayList<Integer>());
		return retList;
	}	
	
	private void searchSumDfs(List<List<Integer>> retList, 
			TreeNode root, int sum, ArrayList<Integer> tmpList){
		if(root == null)
			return ;
		
		sum -= root.val;
		tmpList.add(root.val);
		
		if(root.left == null 
				&& root.right == null
				&& sum == 0){
			retList.add(new ArrayList<Integer>(tmpList));
			return ;
		}
		
		//TODO left not null
		if(root.left != null){
			searchSumDfs(retList,root.left,sum,tmpList);
			tmpList.remove(tmpList.size()-1);
		}
		//TODO right not null
		if(root.right != null){
			searchSumDfs(retList,root.right,sum,tmpList);
			tmpList.remove(tmpList.size()-1);
		}
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
