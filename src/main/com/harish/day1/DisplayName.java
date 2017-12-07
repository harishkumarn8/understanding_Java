package main.com.harish.day1;

import java.util.Scanner;

public class DisplayName {
	String firstName;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		DisplayName userName = new DisplayName();
		userName.firstName = scanner.nextLine();

		System.out.println(userName.firstName);
		
		scanner.close();
	}

}
