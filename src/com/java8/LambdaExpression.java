package com.java8;

interface MathOperations {
	int operation(int a, int b);
}

public class LambdaExpression {
	public static void main(String[] args) {
		MathOperations op = new MathOperations() {
			
			@Override
			public int operation(int a, int b) {
				return a+b;
			};
		};
		
		System.out.println(op.operation(2, 2));
		
		/*MathOperations op2 = (int a,int b) -> {
			return a+b;
		};*/
		
		MathOperations op2 = (a,b) -> a+b;
		
		System.out.println(op2.operation(5, 5));
	}
}
