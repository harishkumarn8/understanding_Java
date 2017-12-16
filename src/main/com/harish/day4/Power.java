package main.com.harish.day4;

import java.util.*;

public class Power {
static int m,n;

	public static void main(String[] args) {
      Scanner scanner =new Scanner(System.in);
      System.out.println("enter the base and power respectively");
      m=scanner.nextInt();
      n=scanner.nextInt();
      Power a =new Power();
      a.pow(m,n);
      scanner.close();
	}

	
	public void pow(int m,int n){
		int p=m;
		int c=m,s=0;
		for(int i=1;i<n;i++){
			m=p;
			for(int j=1;j<c;j++){
				p+=m;
				//System.out.println(p);
			}
			 s=p;
			 //System.out.println(s);
		}
		System.out.println(c+" to the power "+n+" equals= "+s);
	}
}
