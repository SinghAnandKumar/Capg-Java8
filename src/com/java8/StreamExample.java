package com.java8;

import java.util.LinkedList;

public class StreamExample {
	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>();
		
		list1.add("a");
		list1.add("");
		list1.add("");
		list1.add("b");
		
		System.out.println(list1);
		
		for(String s:list1){
			//logic 
		}
		
		//using java 8 stream feature
		
		int count = (int)list1.stream().filter(String -> String.isEmpty()).count();
		//int count = (int)list1.stream().filter(string -> string.isEmpty()).count();
		System.out.println(count);
	}
}
