package main.com.harish.day3;

import java.util.Scanner;

public class Bubble {
	Scanner scanner = new Scanner(System.in);
	
	static int SIZE=50;
	int num[]= new int[SIZE];
	int i,j;
	public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					System.out.println("Enter the number of numbers in the array");
					int n = scanner.nextInt();
					System.out.println("enter"+n+"integers to be sorted");
					int a[]=new int[n];
					for(int i=0;i<n;i++){
						a[i]=scanner.nextInt();
					}
					scanner.close();
					Bubble b =new Bubble();
					b.sort(a,n);
					
	}
	public void sort(int num[],int n){
		for(j=0;j<n-1;j++){
			for(i=0;i<n-j-1;i++){
				if(num[i]>num[i+1]){
					int temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
					System.out.println(temp);
				}
			}
		}
				System.out.println("the sorted array is");
				for(i=0;i<n;i++){
					System.out.println(num[i]);
				}
	
	}
}
