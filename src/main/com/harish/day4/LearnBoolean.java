package main.com.harish.day4;

import main.com.harish.day2.Fibonacci;

public class LearnBoolean {

	public static void main(String[] args) {
		
		Boolean boolTrue = new Boolean(true);
		
		Boolean boolFalse = new Boolean(Boolean.FALSE);
		
		String x = "hariw";
		Boolean boolStringFalse = new Boolean(x);
		
		System.out.println(boolStringFalse);
		Boolean boolStringFalseNull = new Boolean(null);
		System.out.println("boolStringFalseNull: " + boolStringFalseNull);
		System.out.println(boolTrue);
		System.out.println(boolFalse);
		
		Boolean boolStringTrue = new Boolean(x);
		System.out.println("boolStringTrue: " + boolStringTrue);
		
		//Boolean boolFalseObj = Boolean.FALSE;
		
	}

}
