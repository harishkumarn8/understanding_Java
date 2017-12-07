package main.com.harish.day2;
import java.util.Scanner;

public class Binarytodec {

	public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					System.out.println("Enter the binary number");
					int bin = scanner.nextInt();
					int dec=0,pow=0;
					while(bin>0){
					int dig = bin%10;
					dec+=dig*Math.pow(2,pow);
					bin=bin/10;
					pow++;
					
					}
					System.out.println("the decimal no is "+dec);
	}

}
