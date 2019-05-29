
   /* use of Hashmap for key and value set to UNorder pair or  NOT maintanence*/


   import java.util.*;
    public class COllDemo8{
     public static void main(String arr[])
     {
     HashMap<Integer,String> mp=new  HashMap<Integer,String>();//for heterogenous values;for  homogeneous  uuse <Integer> so on
     mp.put(101,"w");
	  mp.put(102,"e");
	  mp.put(103,"ff");
	  mp.put(104,"klx");
	   
          for(Map.Entry m:mp.entrySet()){  
           System.out.println(m.getKey()+" "+m.getValue());  
	   
	}
		   
	 
	 }
	 }
	  