package main.com.harish.day4;

public class MatrixMultiplication {
	
	

	public  MatrixMultiplication(int[][] a,int[][] b,int m,int n,int p,int q){
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
		System.out.println("product of the two matrices");
		for(int i=0;i<m;i++){
			System.out.println(" ");
		
			for(int j=0;j<q;j++){
				System.out.println(c[i][j]);
			}
		}
}
}