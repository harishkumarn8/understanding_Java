package com.harish.day2;

public class Fibonacci {

	public static void main(String[] args) {
					int fib1=0,fib2=1,fib;
					int i=10;
					while(i>0){
						fib=fib1+fib2;
						i--;
						System.out.println(fib);
						fib1=fib2;
						fib2=fib;
					}
					
					

	}

}
