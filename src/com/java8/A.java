package com.java8;
public class A implements I {
	 @Override
	public void print() {
		I.super.print();
		I.show();
		System.out.println("In print method of Class A");
	}
	 
	 public void printI(){
		 I.super.print();
	 }
	 
	 
}
