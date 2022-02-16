package com.fsc_GraphBreathFirstSearch;

import java.util.List;
import java.util.Map;



public class BreathData {
	private Map<String,List<String>> val;
	
	//Constructor of Breath Data
	public BreathData(Map<String,List<String>> val) {
		super();
		this.val = val;
		System.out.println(this.val);
	}
	
	
	//Method Creating BFS of Providing Graph using Queue and Recursion terminology
	public void result(List<String> list) {
		if(list!=null) {
			for(String i: list) {
				if(i!="") {
					System.out.println(i);		
				}
			}
			for(String j: list) {
				result(val.get(j));
			}
			
		}
	}
	
}




