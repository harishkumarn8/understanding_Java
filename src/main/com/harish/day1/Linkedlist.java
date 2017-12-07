package main.com.harish.day1;

import java.util.*;

public class Linkedlist {
				
	class Node{
				private Node link;
				private int data;
		        Node()
		        {
			    link=null;
				data=0;
				}
		        Node(Node n,int d)
		        {
				   link=n;
				   data=d;
		        }
		public void setlink(Node n){
									link=n;
									}
		public void setdata(int d){
									data=d;
									}
		public Node getlink(){
								return link;
								}
		public int getdata(){
								return data;
							}
		
		}
	class List{
				Node start,end;
				int size;
				List(){
						start=end=null;
						size=0;
				       }
				void isEmpty(){
									if(start==null){
										System.out.println("list is empty");
									}
									else{
										System.out.println("list is not empty");
									}
										
							
									}
			 int	getSize(){
							return size;
							}
			public void  insertAtStart(int d){
				Node nptr= new Node(null,d);
//				Node ptr= null;
				if(start==null){
					start=nptr;
					end=start;
					
				}
				else{
						nptr.link=start;
						start=nptr;
				}
				size++;
			}
				
		public void insertAtEnd(int d){
			Node nptr= new Node(null,d);
			//Node ptr=null;
			if(start==null){
				start=nptr;
				end=start;
			}
			else{
				  end.link=nptr;
				  end=nptr;
			}
			size++;
		}
		public void insertAtPosition(int d,int pos){
			Node nptr= new Node(null,d);
			Node ptr= null;
			if(pos==1){
				insertAtStart(d);
			}
			else if(pos==size){
				insertAtEnd(d);
			}
			else{
				 pos=pos-1;
				 ptr=start;
				 for(int i=1;i<=pos;i++){
					 if(i==pos){
						 nptr.link=ptr.link;
						 ptr.link=nptr;
				 }
					 ptr=ptr.link;
					 
				 }
				 size++;
			}
			
		}
	public void deleteAtPosition(int p){
		if(p==1){
			start=start.link;
			size--;
		}
		    
		else if(p==size){
			Node t=start;
		    Node s=start;
			 p=p-1;
			 for(int i=1;i<=p;i++){
				 if(t==end){
					 end=s.link;
					 size--;
					 break;
				 }
				 s=t;
				 t=t.link;
			
			 }
		}
		else{
			Node t=start;
		    Node s=start;
			 p=p-1;
			 for(int i=1;i<=p;i++){
                  if(i==p){
					 s.link=t.link;
					 size--;
					 break;
				 }
				 s=t;
				 t=t.link;
		    }
	     }
			
	    }
	  public void display(){
		  Node ptr=start;
		  do{
			  System.out.print(" "+ptr.data);
			  ptr=ptr.link;
		  }while(ptr!=end);
		  System.out.print(" "+ptr.data);
	  }
	
	}
		
		
	

	public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					int choice=0,dat,po;
					int ch=0;
					Linkedlist a = new Linkedlist();
					List lst = a.new List();
				do{
					System.out.println("The list operations are");
					System.out.println("1.insert at the beginning");
					System.out.println("2.insert at the end");
					System.out.println("3.insert at position");
					System.out.println("4.delete at position");
					System.out.println("5.get size of the linked list");
					System.out.println("6.check whether list is empty");
					choice=scanner.nextInt();
					switch(choice){
					case 1:System.out.println("enter data to be inserted");
							dat=scanner.nextInt();
							lst.insertAtStart(dat);
							break;
							
					case 2: System.out.println("enter data to be inserted");
							dat=scanner.nextInt();
							lst.insertAtEnd(dat);
							break;
					case 3: System.out.println("enter data to be inserted");
							dat=scanner.nextInt();
							System.out.println("enter position to be inserted");
							po=scanner.nextInt();
							lst.insertAtPosition(dat, po);
							break;
					case 4: System.out.println("enter position to be deleted");
							po=scanner.nextInt();
							lst.deleteAtPosition(po);
							break;
					case 5: System.out.println("size of the list is"+lst.getSize());
							break;
					case 6: System.out.println("checking whether list is empty");
							lst.isEmpty();
							break;
				   default:System.out.println("displaying list");
							lst.display();
							
						}
					System.out.println("if you want to continue enter 1");
				    ch=scanner.nextInt();
				}while(ch==1);
		scanner.close();		
				
	}

}
