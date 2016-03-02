package com.yzhou9071.Algorithm;

public class SortAlgorithm {
	public static void mergeSort(int[] nums){
		if(nums.length <= 0)
			return;
		
		int[] tmp = new int[nums.length];
		_mergeSort(nums,tmp,0,nums.length-1);
	}
	private static void _mergeSort(int[] nums, int[] tmp, 
			int leftLoc, int rightLoc){
		if(leftLoc < rightLoc){
			int midLoc = (leftLoc + rightLoc) / 2;
			_mergeSort(nums,tmp,leftLoc,midLoc);
			_mergeSort(nums,tmp,midLoc+1,rightLoc);
			mergeSortedArray(nums,tmp,leftLoc,midLoc,rightLoc);
		}
	}
	private static void mergeSortedArray(int[] nums, int[] tmp,
			int leftLoc, int midLoc, int rightLoc){
		int leftIndex = leftLoc;
		int rightIndex = midLoc + 1;
		int tmpIndex = 0;
		
		while((leftIndex <= midLoc) 
			&& (rightIndex <= rightLoc)){
			if(nums[rightIndex] > nums[leftIndex])
				tmp[tmpIndex++] = nums[leftIndex++];
			else
				tmp[tmpIndex++] = nums[rightIndex++];
		}

		while(leftIndex <= midLoc)
			tmp[tmpIndex++] = nums[leftIndex++];
		while(rightIndex <= rightLoc)
			tmp[tmpIndex++] = nums[rightIndex++];
		
		for(int i=0;i<tmpIndex;i++)
			nums[leftLoc+i] = tmp[i];
	}
	
	public static void quickSort(int[] nums){
		if(nums.length <=0)
			return;
		
		_quickSort(nums,0,nums.length-1);
		
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");
		
	}
	private static void _quickSort(int[] nums, int low, int high){
		if(low < high){
			int midPos = _partition(nums, low, high);
			_quickSort(nums, low, midPos-1);
			_quickSort(nums, midPos+1, high);
		}
	}
	private static int _partition(int[] nums, int low, int high){
		int baseVal = nums[low];
		
		while(low < high){
			while((low < high) && (nums[high] >= baseVal))
				high--;
			swap(nums, low, high);
			
			while((low < high) && (nums[low] <= baseVal))
				low++;
			swap(nums, low, high);
		}
		return low;
	}
	private static void swap(int[] nums, int low, int high){
		if(nums[low] != nums[high]){
			nums[high] ^= nums[low];
			nums[low] ^= nums[high];
			nums[high] ^= nums[low];
		}
	}
	
	public static void bubbleSort(int[] nums){
		if(nums.length <=0 ) 
			return; 
		
		int len = nums.length;
		boolean exchangeFlag;
		for(int i=0;i<len;i++){
			exchangeFlag = false;
			for(int j=0;j<len-i-1;j++){
				if(nums[j] > nums[j+1]){
					nums[j+1] ^= nums[j];
					nums[j] ^= nums[j+1];
					nums[j+1] ^= nums[j];
					exchangeFlag = true;
				}
			}
			if(!exchangeFlag)
				break;
		}
	}
	
	
	public static int[] heapNum;
	public static int len;
	public static void heapSort(int[] nums){
		heapNum = nums;
		if(heapNum.length <= 0)
			return;
		
		len = heapNum.length;
		for(int i=len/2-1;i>=0;i--){
			maxHeapify(i);
		}
		
		for(int i=heapNum.length-1;i>0;i--){
			if(heapNum[i] != heapNum[0]){
				heapNum[i] ^= heapNum[0];
				heapNum[0] ^= heapNum[i];
				heapNum[i] ^= heapNum[0];
				
				len--;
				maxHeapify(0);
			}
		}
	}
	private static void maxHeapify(int index){
		int leftIndex = leftNode(index);
		int rightIndex = rightNode(index);
		int largestIndex;
		
		if((rightIndex < len)
				&&(heapNum[rightIndex] > heapNum[index]))
			largestIndex = rightIndex;
		else
			largestIndex = index;
		
		if((leftIndex < len)
				&&(heapNum[leftIndex] > heapNum[largestIndex]))
			largestIndex = leftIndex;
		
		if(largestIndex != index){
			heapNum[index] ^= heapNum[largestIndex];
			heapNum[largestIndex] ^= heapNum[index];
			heapNum[index] ^= heapNum[largestIndex];
			maxHeapify(largestIndex);
		}
	}
	private static int leftNode(int index){
		return 2*index+1;
	}
	private static int rightNode(int index){
		return 2*index+2;
	}
	
	public void selectSort(int[] nums){
		if(nums.length <= 0)
			return;
		
		int len = nums.length;
		for(int i=0;i<len;i++){
			int tmp = i;
			for(int j=i+1;j<len;j++){
				if(nums[j] < nums[tmp])
					tmp = j;
			}
			if(nums[i] != nums[tmp]){
				nums[i] ^= nums[tmp];
				nums[tmp] ^= nums[i];
				nums[i] ^= nums[tmp];
			}
		}
	}
	
	public void shellSort(int[] nums, int k){
		if(nums.length <= 0)
			return;
		
		int len = nums.length;
		for(int span=k;span>=1;span/=2){
			for(int i=0;i+span<=len;i+=span){
				int tmp = nums[i];
				int j = i - span;
				for(; j>=span-1 && nums[j]>tmp;j-=span){
					nums[j+span] = nums[j];
				}
				nums[j+span] = tmp;
			}
		}		
	}
	
	public void insertionSort(int[] nums){
		if(nums.length <= 0)
			return;
		
		for(int i=1;i<nums.length;i++){
			int tmp = nums[i];
			int j = i - 1;
			for(;j>=0 && nums[j]>tmp;j--){
				nums[j+1] = nums[j];
			}
			nums[j+1] = tmp;
		}
	}
	
	private static void outputArray(int[] nums){
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");
	}
	
	public static void main(String[] args){
		int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		mergeSort(a);
		
	}
}
