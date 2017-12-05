package main.com.harish.day2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					System.out.println("Enter a number");
					int num = scanner.nextInt();
					Factorial a= new Factorial();
					int f=a.fact(num);
					System.out.println("Factorial of the given number is "+f);
	}
	public int fact(int n){
				if(n==0)
					return 1;
				return n*fact(n-1);
	}

}
