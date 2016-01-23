package com.digitek.primitives;

public class MathOperationsWithReturntypes {

	public static void main(String[] args) {
		additionOfTwoNumbers();
		int result1 = additionWithReturnTypes();
		int result2 = result1 + 10;
		int result3 = result1 + 20;
		
		System.out.println("result 2 = " + result2);
		System.out.println("result 3 = " + result3);
		
		additionWithParameters(25, 25);
		additionWithParameters( 35, 35);
		additionWithParameters( 25, -35);
	}
	
	//modifiers - public, static, void
	//void - return type of nothing. 
	public static void additionOfTwoNumbers(){
		int number1 = 10;
		int number2 = 20;
		
		int sum = number1 + number2;
		System.out.println("Sum = " + sum);
	}
	
	//This method returns an int value.
	public static int additionWithReturnTypes(){
		int number1 = 10;
		int number2 = 20;
		
		int sum = number1 + number2;
		System.out.println("Addition Sum = " + sum);
		
		return sum; 
	}
	public static int additionWithParameters(int number1, int number2){
	
		int sum = number1 + number2;
		System.out.println("Addition Sum With Parameters Example= " + sum);
		
		return sum; 
	}

}
