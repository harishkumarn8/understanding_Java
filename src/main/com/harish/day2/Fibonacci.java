package main.com.harish.day2;
import java.math.*;
public class Fibonacci {
	
	int init0;
	int init1;
	int init;
	
	int INIT = 0;
	
	public String toString() {
		return "Initial Fibonacci Number is: " + new Integer(init).toString();
	}
	
	public Fibonacci() {
		this.init0 = 0;
		this.init1 = 1;
	}
	
	public Fibonacci(int init) {
		this.init0 = 0;
		this.init1 = 1;
		// check whether init is actually a Fibonacci Number
		
		// if yes
		this.init = init;
		
		// if no
		// generate next fibonacci and assign to init
		this.init = nextClosestFibonacciNumber(init);
		
	}
	
	public static boolean isFibonacci(int number) {
		boolean flag = false;
		// generate next fibonacci, number <=> fibonacci
		int a=0,b=0;
		a= (5*number*number)+4;
		b=(5*number*number)-4;
		int c= (int)Math.sqrt(a);
		int d=(int)Math.sqrt(b);
		if((a==c*c)||(b==d*d)){
			flag=true;
		}
		return flag;
	}
	
	public int nextClosestFibonacciNumber(int number) {
		int nextClosestFibonacci = -1;
		
		return nextClosestFibonacci;
	}
	
	public int nextFibonacciNumber(int number) throws Exception
	{
		if(!isFibonacci(number)) {
			throw new Exception("Not a Fibonacci Exception");
		}
		
		int nextFibonacci = -1;
		// generate next Fibo
		
		return nextFibonacci;
	}
	
	public void printNextNFibonacciNumbers() {
		printNextNFibonacciNumbers(5);
	}
	
 	public void printNextNFibonacciNumbers(int n) {
 		// if negative all prev 5
 		// handle code here
 		
		// from init call next so many times
		
		// always init is a Fibonacci number
		int next = init;
		for (int i=0; i<n; i++) {
			try {
				next = nextFibonacciNumber(next);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(next);
		}
	}

//	public static void main(String[] args) {
//					int fib1=0,fib2=1,fib;
//					int i=10;
//					while(i>0){
//						fib=fib1+fib2;
//						i--;
//						System.out.println(fib);
//						fib1=fib2;
//						fib2=fib;
//					}
//					
//	}

}
