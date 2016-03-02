package com.yzhou9071.Algorithm;

import java.util.ArrayList;

public class BinaryTreeAlgorithm {
	private TreeNode root;
	
	public BinaryTreeAlgorithm(){
		
	}
	
	public BinaryTreeAlgorithm(int val){
		this.root = new TreeNode(val);
	}
	
	public void createBinaryTree(int[] initData){
		if(initData != null){
			for(int tmp: initData)
				_createBTree(tmp);
		}
	}
	private void _createBTree(int val){
		if(root == null){
			root = new TreeNode(val);
		}else{
			TreeNode parentNode;
			TreeNode curNode = root;
			while(true){
				parentNode = curNode;
				if(curNode.val > val){
					curNode = curNode.leftNode;
					if(curNode == null){
						parentNode.leftNode = new TreeNode(val);
						break;
					}
				}else{
					curNode = curNode.rightNode;
					if(curNode == null){
						parentNode.rightNode = new TreeNode(val);
						break;
					}
				}
			}
		}
	}
	
	public void preOrderTree(TreeNode node, ArrayList<Integer> outputTree){
		if(node != null){
			outputTree.add(node.val);
			preOrderTree(node.leftNode, outputTree);
			preOrderTree(node.rightNode, outputTree);
		}
	}
	
	public void midOrderTree(TreeNode node, ArrayList<Integer> outputTree){
		if(node != null){
			preOrderTree(node.leftNode, outputTree);
			outputTree.add(node.val);
			preOrderTree(node.rightNode, outputTree);
		}
	}
	
	public void postOrderTree(TreeNode node, ArrayList<Integer> outputTree){
		if(node != null){
			preOrderTree(node.leftNode, outputTree);
			preOrderTree(node.rightNode, outputTree);
			outputTree.add(node.val);
		}
	}
	
	public ArrayList<Integer> levelOrderTree(){
		ArrayList<TreeNode> levelTree = new ArrayList<TreeNode>();
		ArrayList<Integer> orders = new ArrayList<Integer>();
		TreeNode tmpNode;
		
		levelTree.add(root);
		while(levelTree.size() > 0){
			orders.add(root.val);
			tmpNode = levelTree.get(0);
			levelTree.remove(0);
			if(tmpNode.leftNode != null)
				levelTree.add(tmpNode.leftNode);
			if(tmpNode.rightNode != null)
				levelTree.add(tmpNode.rightNode);
		}
		
		return orders;
	}
	
	public int statisticNodeCount(TreeNode node){
		int nodeNums = 0;
		
		if(node != null){
			nodeNums = nodeNums 
					+ statisticNodeCount(node.leftNode)
					+ statisticNodeCount(node.rightNode);
		}
		
		return nodeNums;
	}
	
	public TreeNode searchNode(int val){
		TreeNode node = root;
		
		while(node.val != val){
			if(node.val > val){
				node = node.leftNode;
			}else{
				node = node.rightNode;
			}
			if(node == null)
				break;
		}
		
		return node;
	}
	
	public class TreeNode{
		int leftOrRight = 0;
		int val;
		TreeNode leftNode;
		TreeNode rightNode;
		
		public TreeNode(int val){
			this.val = val;
		}
	}
}
