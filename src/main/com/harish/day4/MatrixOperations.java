package main.com.harish.day4;
import java.util.*;
public class MatrixOperations {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int m,n,p,q;
		System.out.println("Enter dimensions of the first and second respectively ");
	/*	m=scanner.nextInt();
		n=scanner.nextInt();
		p=scanner.nextInt();
		q=scanner.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[p][q];
		
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
		scanner.close();
			MatrixMultiplication ma = new MatrixMultiplication(a, b, m, n, p, q);
		*/	
		//	
			Matrix mat =new Matrix();
			mat.matrixMultiplication();
	}

}
