package com.harish.day2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
							String str,rev="";
							Scanner scanner = new Scanner(System.in);
							System.out.println("enter a string");
							str=scanner.nextLine();
							scanner.close();
							int len = str.length();
							for(int i=len-1; i>=0;i--){
								rev=rev+str.charAt(i);
								
							}
						System.out.println("the reverse string is "+rev);
	}

}
