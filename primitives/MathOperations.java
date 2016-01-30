package com.digitek.primitives;
//This Project can do math operation comment add by Hasmukh 
public class MathOperations {

	public static void main(String[] args) {
		additionOfTwoNumbers();
		subtraction();
		multiplication();
		division();

	}

	
	public static void additionOfTwoNumbers(){
		int number1 = 10;
		int number2 = 20;
		
		int sum = number1 + number2;
		System.out.println("Sum = " + sum);
	}
	
	public static void subtraction(){
		int number1 = 50;
		int number2 = 25;
		
		int sum = number1 - number2;
		System.out.println("Subtraction Result = " + sum);
		
		
	}
	public static void multiplication(){
	
		int number1 = 10;
		int number2 = 10;
		
		int sum = number1 * number2;
		System.out.println("Multiplication Result = " + sum);
	}
	public static void division(){
		int number1 = 100;
		int number2 = 20;
		
		int sum = number1 / number2;
		System.out.println("Division Result = " + sum);
	
	}
	
}
