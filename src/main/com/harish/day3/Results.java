package main.com.harish.day3;
import  java.util.*;
public class Results {
    Scanner scanner = new Scanner(System.in); 
	public static void main(String[] args) {
				Student s =new Student();
				System.out.println("using Student class object ");
				s.udetails();
				s.cdetails();
				s.sdetails();
				System.out.println("using Teacher class object");
				Teacher t =new Teacher();
				t.udetails();
				t.cdetails();
				t.tdetails();
				t.results();
	}

}
