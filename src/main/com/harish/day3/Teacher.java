package main.com.harish.day3;

public class Teacher extends College {
		int tid=10;
		String tname="Gopal";
		String subject="Java";
		String taddress="Bangalore";
		/*public Teacher(int id,String name,String sub,String address){
			tid=id;
			tname=name;
			subject=sub;
			taddress=address;
			
		}*/
		public void tdetails(){
			System.out.println("teacher id="+tid);
			System.out.println("teacher name="+tname);
			System.out.println("teacher address="+taddress);
			System.out.println("teaching subject"+subject);
			
		}
}
