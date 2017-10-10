package com.harish.day3;

import java.util.Scanner;

public class Isprime {

	public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					System.out.println("enter a number");
					int num= scanner.nextInt();
					for(int i=2;i<num;i++){
						if(num%i == 0){
							System.out.println(num+"is not a prime");
						 return;
						}
					}
					System.out.println(num+"is a prime");
	}

}
