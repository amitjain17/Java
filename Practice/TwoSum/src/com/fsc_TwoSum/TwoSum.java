package com.fsc_TwoSum;

import java.util.HashMap;
import java.util.Map;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/

public class TwoSum {
	public static void main(String args[]) {
		
		//int nums[] = {2,7,11,15};
		int nums[] = {3,3};
		//int target = 9;
		int target = 6;
		int new_val=0;
		int i =0;
		Map<Integer,Integer> val = new HashMap<>();
		
		for(i=0;i<nums.length;i++) {
			new_val = target-nums[i];
			if(val.get(new_val)!=null) {
				break;
			}
			val.put(nums[i],i);
		}
		System.out.println(i+" "+val.get(new_val));
		
		
		
		
//		Brut Force Solution with complexity O(n^2)
//		
//		for (int i=0;i<nums.length;i++) {
//			for(int j=i+1;j<nums.length;j++) {
//				sum = nums[i]+nums[j];
//				if(sum==target) {
//					System.out.println(i+" "+j);
//				}
//			}
//		}
		
	}

}
