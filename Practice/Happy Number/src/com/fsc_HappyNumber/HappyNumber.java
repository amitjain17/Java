package com.fsc_HappyNumber;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
	public static void main(String args[]) {
		int n = 19;
		int r = 0;
		String status = "";
		List<Integer> list = new ArrayList<>();
		while(r != 1) {
			r= happy(n);
			n = r;
			for(int i:list) {
				if(i==n) {
					status = "over";
				}
			}
			if(status=="over") {
				break;
			}
			list.add(n);
			System.out.println(r);
		}
	}
	static int happy(int n) {
		int val = n%10;
		n = n/10;
		if(n==0) {
			return (val*val);
		}
		return (val*val)+happy(n);
	}

}
