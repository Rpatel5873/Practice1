package com.digitek.primitives;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		relationalOperators();
	} 
	public static void differentPrimitiveDataTypes() {
		//these are simple data types used to represent the type of data the variable holds
		//data types: int, double, char, boolean
		
		//int data types
		//byte = 8 bits
		//range 128 to -127
		
		//short = double of bytes, it holds 16 bits 
		//range: -2 power 15, 2 power15 -1
		
		//int: 32 bits
		//range: -2 power 31, 2 power31 -1
		
		//long: 64 bits
		//range: -2 power 63, 2 power63 -1
		
		//defining int value
		//int number1 = 10;
		//other int datatypes
		//byte, short, int, long
		
		//defining decimal value - float or double 
		//float = 32 bits
		//double = 64 bits
		//double price = 10.50;
		
		//defining character datatypes 
		//char value ='a';
		
		//boolean - represent true or false
		//boolean isTrue = true;
		//boolean isFalse = false;
	
	}
	
	public static void relationalOperators() {
		
		
		// == equal to
		// != not equal to
		// > greater than
		// < less than
		// >= greater than or equal to
		// <= less than or equal to
		
		double value1 = 20.5;
		int value2 = 20;
		
		if (value1 == value2) {
			System.out.println("value1 == value2");
		}
		
		if (value1 != value2) {
			System.out.println(value1!=value2);
			System.out.println("value1 != value2");
		}	
		
		System.out.println(value1 == value2); 
		if (value1 > value2) {
			System.out.println("value1 > value2");
			
		}
		
		if (value1 < value2) {
			System.out.println("value1 < value2");
		}
		
		if (value1 >= value2) {
			System.out.println("value1 >= value2");
		}
		
		if (value1 <= value2) {
			System.out.println("value1 <= value2");
		}
		
		

		
	}
}
