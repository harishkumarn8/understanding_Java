package com.harish.day3;

import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					System.out.println("Enter the number of numbers in the array");
					int n = scanner.nextInt();
					System.out.println("enter"+n+"intgers to be sorted");
					int num[]= new int[n];
					for(int i=0;i<n;i++){
						num[i]=scanner.nextInt();
					}
					for(int j=0;j<n-1;j++){
						for(int i=0;i<n-j;i++){
							if(num[i]<num[i+1]){
								int temp=num[i];
								num[i]=num[i+1];
								num[i+1]=temp;
								System.out.println(temp);
							}
						}
					}
							System.out.println("the sorted array is");
							for(int i=0;i<n;i++){
								System.out.println(num[i]);
							}
							
					
	}

}
