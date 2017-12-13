package main.com.harish.day4;
import main.com.harish.day3.Bubble;
import java.util.*;
public class BinarySearch {
    
   static int n;
   static int a[]=new int[50];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bubble b =new Bubble();
		BinarySearch bs =new BinarySearch();
		System.out.println("Enter the size of the array to be searched");
		n=scanner.nextInt();
		System.out.println("Enter the elements of the array to be searched");
		for(int i=0;i<n;i++){
			a[i]=scanner.nextInt();
		}
		b.sort(a,n);
		System.out.println("Enter the element to be searched");
		int key=scanner.nextInt();
		scanner.close();
		bs.binarySearch(a, n, key);
	}
	public void binarySearch(int a[],int n,int key){
		int start=0,end=n,mid=0,flag=0;
		do{
			mid=(int)(start+end)/2;
			if(a[mid]==key){
				System.out.println("element found at index"+mid);
				flag=1;
				break;
			}
			else if(a[mid]<key){
				start=mid+1;
			}
			else if(a[mid]>key){
				end=mid-1;
			}
		}while(start<end);
		if(flag==0){
	System.out.println("element "+key+" not found");	
		}

	}

}
