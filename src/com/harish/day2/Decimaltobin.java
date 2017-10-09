package com.harish.day2;

import java.util.Scanner;

public class Decimaltobin {

	public static void main(String[] args) {
				Scanner scanner= new Scanner(System.in);
				System.out.println("Enter the Decimal number");
				int dec = scanner.nextInt();
				int rem=0;
				String bin="";
				while(dec>0){
					rem=dec%2;
					bin=rem+bin;
					dec=dec/2;
				}
				System.out.println("the binary equivalant of the given decimal number"+bin);
	}

}
