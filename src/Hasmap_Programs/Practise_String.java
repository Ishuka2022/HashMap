package Hasmap_Programs;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Practise_String 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Any String : ");
	       String para = sc.nextLine();
	       
	      String[] ar = para.split(" ");
	      HashMap<String,Integer> hs = new HashMap<String,Integer>();
	      for(int i=1;i<=ar.length-1;i++)
	      {
	    	 String s1 = ar[i];
	    	 if(hs.containsKey(s1))
	    	 {
	    		 hs.put(s1, hs.get(s1)+1);
	    	 }
	    	 else
	    	 {
	    		 hs.put(s1, 1);
	    	 }
	      }
        System.out.println("---get all keys---");
              Set<String> allkeys = hs.keySet();
            for(String keys:allkeys)
            {
            	System.out.println(keys+":"+hs.get(keys));	  
            }
            
            System.out.println("---Occurance of data---");
           Set<String> allkeys1 = hs.keySet();
           for(String keys:allkeys)
           {
        	   if(hs.get(keys)>1)
        	   {
        		   System.out.println(keys+":"+hs.get(keys));
        	   }
           }
           System.out.println("This is change  from us client");
	}

}
