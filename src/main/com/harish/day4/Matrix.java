package main.com.harish.day4;
import java.util.*;
public class Matrix{
	Scanner scanner =new Scanner(System.in);
	int m=50,n=50,p=50,q=50;
	int a[][]=new int[m][n];
	int b[][]=new int[p][q];
	public Matrix(){
		System.out.println("Enter dimensions of the first and second respectively ");
		m=scanner.nextInt();
		n=scanner.nextInt();
		p=scanner.nextInt();
		q=scanner.nextInt();
	//	int a[][]=new int[m][n];
		//int b[][]=new int[p][q];
		
		while(n!=p){
			System.out.println("wrong dimensions");
			System.out.println("enter correct dimensions");
			}
		
		System.out.println("enter elements in first matrix");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++){
				a[i][j]=scanner.nextInt();
			}
		System.out.println("enter elements in second matrix");
		for(int i=0;i<p;i++)
			for(int j=0;j<q;j++){
				b[i][j]=scanner.nextInt();
			}
	}
	
	public void matrixMultiplication(){
		int c[][] = new int[n][p];
		for(int i=0;i<n;i++)
			for(int j=0;j<p;j++){
				c[i][j]=0;
			}
		for(int i=0;i<m;i++)
			for(int j=0;j<q;j++)
			for(int k=0;k<n;k++){
				c[i][j]+=a[i][k]*b[k][j];
			}
		System.out.println("first matrix");
		for(int i=0;i<m;i++){
			System.out.println(" ");
		
			for(int j=0;j<n;j++){
				System.out.println(a[i][j]);
			}
		}
		System.out.println("second matrix");
		for(int i=0;i<p;i++){
			System.out.println(" ");
		
			for(int j=0;j<q;j++){
				System.out.println(b[i][j]);
			}
		}
		System.out.println("product of the two 3matrices");
		for(int i=0;i<m;i++){
			System.out.println(" ");
		
			for(int j=0;j<q;j++){
				System.out.println(c[i][j]);
			}
		}
	}
	

}
