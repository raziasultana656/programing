import java.util.*;
public class COllDemo2{
public static void main(String arr[])
{
       ArrayList<Integer> list=new ArrayList<Integer>();
     list.add(34);
	  list.add(355);
	  list.add(33);
	  list.add(24);
	  System.out.println(list);
	   list.add(1,39);   //to shift the number by adding values
	   
	  System.out.println(list);
	  //to remove the number
	  list.set(2,50);
	    System.out.println(list);
		//to find the index of collection
           int index=list.indexOf(24);		   
                System.out.println(index);
				//remove the vlue by  using the index values 
				list.remove(index);
					   
	  System.out.println(list);
		
	  }
	  }