package com.fsc_ArithmeticSlices;

import java.util.Arrays;

//An integer array is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
//
//For example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are arithmetic sequences.
//Given an integer array nums, return the number of arithmetic subarrays of nums.
//
//A subarray is a contiguous subsequence of the array.

public class ArithmeticSlices {
	
	public static void main(String args[]) {
		int[] nums = {1,2,3,8,9,10};
		if(nums.length == 1) {
			System.out.println("One element");
		}
		int count  = 0;
		int curr_point = 2;
		Arrays.sort(nums);
		for(int i =curr_point;i<nums.length;i++) {
			if((nums[i]-nums[i-1]) == (nums[i-1]-nums[i-2])){
				System.out.println(nums[i]+" "+nums[i-1]+" "+nums[i-2]);
				count++;
			}
			if(i==nums.length-1 && curr_point!=nums.length-1) {
				i = curr_point;
				curr_point++;		
			}
		}
		System.out.println(count);
	}

}
