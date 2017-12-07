package main.com.harish.day3;

import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					System.out.println("Enter the number of numbers in the array");
					int n = scanner.nextInt();
					final int SIZE=n;
					int i,j;
					System.out.println("enter"+n+"intgers to be sorted");
					int num[]= new int[SIZE];
					for(i=0;i<SIZE;i++){
						num[i]=scanner.nextInt();
					}
					for(j=0;j<SIZE;j++){
						for(i=0;i<SIZE-j;i++){
							if(num[i]<num[i+1]){
								int temp=num[i];
								num[i]=num[i+1];
								num[i+1]=temp;
								System.out.println(temp);
							}
						}
					}
							System.out.println("the sorted array is");
							for(i=0;i<SIZE;i++){
								System.out.println(num[i]);
							}
							
					
	}

}
