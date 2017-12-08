package main.com.harish.day3;
public class University{
			String uname="VTU";
			String uaddress="Belgaum";
			int marks[]={90,67,39,89,56};
		//	int total;
			public void udetails(){
				System.out.println("University name="+uname);
				System.out.println("University address="+uaddress);
			}
			public void results(){
				int total=0;
				boolean flag=true;
				float per=0;
				for(int x:marks){
					if(x<35){
						for(int y:marks){
							System.out.println(y);
						}
						System.out.println("FAIL");
						flag=false;
						
					}
					
					total+=x;
				}
				if(flag){
			per=total*100/500;
				if(per>70){
					System.out.println("passed with Distinction");
				}
				else if(per>60){
					System.out.println("passed with first class");
				}
				else if(per>50){
					System.out.println("passed with second class");
					
				}
				else if(per>35){
					System.out.println("just passed");
				}
				for(int z:marks){
					System.out.println(z);
				}
			}
				System.out.println("total marks is :"+total);
				System.out.println("percentage is :"+per);
			}
}
