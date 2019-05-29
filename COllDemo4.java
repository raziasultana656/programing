import java.util.*;
public class COllDemo4{
public static void main(String arr[])
{
       ArrayList<Object> list=new ArrayList<Object>();//for heterogenous values;
     list.add(34);
	  list.add(355);
	  list.add(33);
	  list.add(98);
	  System.out.println(list);
	   list.add(1,39);   //to shift the number by adding values
	   
	  System.out.println(list);
	    for(Object i:list){
		System.out.println(i);
		}
	      Iterator itr=list.iterator();
		   while(itr.hasNext()){
			   System.out.println(itr.next());
		   }
		   
	 
		
	  }
	  }