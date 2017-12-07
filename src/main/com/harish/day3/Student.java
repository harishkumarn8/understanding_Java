package main.com.harish.day3;

public class Student extends College {
           int sid=8;
           String sname="Harish";
           String saddress="Bangalore";
           String branch="Information Science";
         /* public Student(int id,String name,String address,String branch){
        	  sid=id;
        	  sname=name;
        	  saddress=address;
        	  this.branch=branch;
          }*/
          public void sdetails(){
        	  System.out.println("student id="+sid);
        	  System.out.println("student name="+sname);
        	  System.out.println("student address="+saddress);
        	  System.out.println("student branch="+branch);
        	  
          }
}
