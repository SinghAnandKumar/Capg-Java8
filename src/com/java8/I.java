package com.java8;

public interface I {
	default void print(){
		
		System.out.println("In print of Interface I...");
	}
	
	static void show(){
		System.out.println("In show of Interface I...");
	}
}
