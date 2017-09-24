package com.harish.day1;

import java.io.IOException;
import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		int a, b;
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter first number");
			a = scanner.nextInt();
			System.out.println("enter second number");

			b = scanner.nextInt();
			
			System.out.println(a+b);
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
