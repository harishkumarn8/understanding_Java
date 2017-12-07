package test.com.harish.day2;

import java.util.List;

import org.junit.*;
import main.com.harish.day2.Fibonacci;

public class TestFibonacci {
	
	@Test
	public void testIsFibonacciNumber() {
		System.out.println("hello");
//		System.out.println(Fibonacci.isFibonacci(10));
	}
	
	@Test
	public void testNextFibonacciNumber() {
		int num = 30;
		int[] next5Fibs = { 30, 60, 90};
		
		List<Fibonacci> fibList = null;
		
		fibList.add(new Fibonacci(100));
		
	}

}
