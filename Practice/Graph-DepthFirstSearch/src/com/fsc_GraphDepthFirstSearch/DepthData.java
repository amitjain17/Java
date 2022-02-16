package com.fsc_GraphDepthFirstSearch;

import java.util.List;
import java.util.Map;

public class DepthData {
	
	private Map<String,List<String>> val;
	private List<String> nums;

	//Constructor of Depth Data
	public DepthData(Map<String,List<String>> val) {
		super();
		this.val = val;
		System.out.println(this.val);
	}
	
	
	//Method Creating DFS of Providing Graph using Stack and Recursion terminology
	public void result(List<String> list) {
		
		for(String i: list) {			
			nums = val.get(i);
			if(nums!= null) {
				System.out.println(i);
				result(nums);	
			}
			else {
				break;
			}
		}
				
	}
	
	
}
