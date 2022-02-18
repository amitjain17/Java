package com.fsc_MinimumDistance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumDistance {
	
	public static void main(String args[]) {
		
		List<Map<String,String>> blocks = new ArrayList<>();
		
		List<String> reqs = Arrays.asList("gym","school","store");

		Map<String,String> data1 = new HashMap<>();
		Map<String,String> data2 = new HashMap<>();
		Map<String,String> data3 = new HashMap<>();
		Map<String,String> data4 = new HashMap<>();
		Map<String,String> data5 = new HashMap<>();

		
		data1.put("gym", "false");
		data1.put("school", "true");
		data1.put("store", "false");
		blocks.add(data1);
		
		
		data2.put("gym", "true");
		data2.put("school", "false");
		data2.put("store", "false");
		blocks.add(data2);
		
		data3.put("gym", "true");
		data3.put("school", "true");
		data3.put("store", "false");
		blocks.add(data3);
		
		data4.put("gym", "false");
		data4.put("school", "true");
		data4.put("store", "false");
		blocks.add(data4);
		
		data5.put("gym", "false");
		data5.put("school", "true");
		data5.put("store", "true");
		blocks.add(data5);
				
		MinimumDistanceCalculation MDC = new MinimumDistanceCalculation();
		MDC.distance(blocks,reqs);
		
	}

}
