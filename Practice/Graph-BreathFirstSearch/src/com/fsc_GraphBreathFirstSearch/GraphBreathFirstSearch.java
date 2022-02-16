package com.fsc_GraphBreathFirstSearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GraphBreathFirstSearch {
	
	public static void main(String args[]) {
			
			Map<String,List<String>> data = new HashMap<String,List<String>>();
			
			data.put("1",Arrays.asList("2","7","8"));
			data.put("2",Arrays.asList("3","6"));
			data.put("3",Arrays.asList("4","5"));
			data.put("4",Arrays.asList(""));
			data.put("5",Arrays.asList(""));
			data.put("6",Arrays.asList(""));
			data.put("7",Arrays.asList(""));
			data.put("8",Arrays.asList("9","12"));
			data.put("9",Arrays.asList("10","11"));
			data.put("10",Arrays.asList(""));
			data.put("11",Arrays.asList(""));
			data.put("12",Arrays.asList(""));
			
			BreathData dpt = new BreathData(data);
			dpt.result(Arrays.asList("1"));
		}
	

}
