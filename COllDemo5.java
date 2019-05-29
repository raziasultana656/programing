import java.util.*;
public class COllDemo5{
public static void main(String arr[])
{
      LinkedList<Object> list=new LinkedList<Object>();//for heterogenous values;for  homogeneous  uuse <Integer> so on
     list.add(34);
	  list.add(355);
	  list.add(33);
	  list.add(98);
	  System.out.println(list);
	   list.addFirst(39);   //to add value at first location
	   
	   
	   
	   //way of print the linkedlist   
	  System.out.println(list);
	
		  list.addLast(943); //to add value at last location;
		  
	      Iterator itr=list.iterator();
		   while(itr.hasNext()){
			   System.out.println(itr.next());
			      
				  
				    list.removeFirst();
					list.removeLast();
					/*	Iterator itr2=list.iterator();
					while(itr2.hasNext()){
						System.out.println(itr2.next());
					}*/
					System.out.print(list);
		   }
		   
	 
		
	  }
	  }