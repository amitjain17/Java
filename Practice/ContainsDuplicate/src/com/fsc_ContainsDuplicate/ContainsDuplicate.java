package com.fsc_ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

//		Given an integer array nums, return true if any value 
//		appears at least twice in the array, and return false 
//		if every element is distinct.

//		Example:
//		Input: nums = [1,2,3,1]
//		Output: true

public class ContainsDuplicate {
	
	public static void main(String args[]) {
		
		int nums[] = {1,2,3,1};
		
		int si = nums.length;
		//Create a Set of an Array
		Set<Integer> arr=  new HashSet<>();
		//Add data in set 'arr'
		for(int i:nums) {
			arr.add(i);
		}
		
		if(arr.size()==si) {
			System.out.println("FALSE");
		}else {
			System.out.println("TRUE");
		}
		
		
	}

}
