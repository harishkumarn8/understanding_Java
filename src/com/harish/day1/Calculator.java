package com.harish.day1;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		System.out.println("The operations are"
				+ "1.addition"
				+ "2.substraction"
				+ "3.multiplication"
				+ "4.division");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number");
		int a = scanner.nextInt();
		System.out.println("enter second number");
		int b = scanner.nextInt();
		int op = scanner.nextInt();
		switch(op){
		case 1:
				System.out.println(a+b);
				break;
		case 2: 
				System.out.println(a-b);
				break;
		case 3:
				System.out.println(a*b);
				break;
		case 4:
				System.out.println(a/b);
				break;
		default:
				System.out.println("select the given operations");
		}
		scanner.close();
	}

}
