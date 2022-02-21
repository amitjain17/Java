package com.fsc_AddTwoNumbersLinkedList;

import java.util.LinkedList;

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.

public class AddTwoNumbersLinkedList {
	
	public static void main(String args[]) {
		
		String si="";
		String si2="";
		LinkedList<Integer> li1 = new LinkedList<>();
		li1.add(2);
		li1.add(4);
		li1.add(3);

		LinkedList<Integer> li2 = new LinkedList<>();
		li2.add(5);
		li2.add(6);
		li2.add(4);
			
		for(int i = li1.size();i>0;i--) {
			si +=li1.get(i-1);			
		}
		for(int j = li2.size();j>0;j--) {
			si2 +=li2.get(j-1);
		}
		
		int sum = Integer.parseInt(si)+ Integer.parseInt(si2);
	
		String s =Integer.toString(sum);
		String s1[] = s.split("");
		
		LinkedList<String> li3 = new LinkedList<>();
		for(String k : s1) {
			li3.add(k);
		}
		System.out.println(li3);

	}

}
