package com.harish.day1;
import java.util.Scanner;
public class Stringreverse {

	public static void main(String[] args) {
		String str,rev="";
		System.out.println("Enter a string");
		Scanner scanner = new Scanner(System.in);
		 str = scanner.nextLine();
		int len = str.length();
		scanner.close();
		for(int i=len-1; len>=0; i--){
					// rev= new String();
					//	String a = new Strin
					rev = rev+str.charAt(i);
			
				System.out.print(rev);
		}
	//	System.out.println("the reverse is" +rev);
//scanner.close();
	}

}
