package Hasmap_Programs;

import java.util.HashMap;
import java.util.Set;

public class Repetation_Of_Word_Count 
{
	public static void main(String[] args) 
	{
	     String org = "abcdabc";
	     
	     HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
	     
	     for(int i=0;i<=org.length()-1;i++)
	     {
	    	char s1 = org.charAt(i);
	    	
	    	if(hs.containsKey(s1))
	    	{
	    		hs.put(s1,hs.get(s1)+1);	
	    	}
	    	else
	    	{
	    		hs.put(s1, 1);
	    	}
	     }
	     System.out.println("----get all keys & Value----");
		Set<Character> allkeys = hs.keySet();
		for(Character key:allkeys)
		{
			System.out.println(key+":"+hs.get(key));
	    }
		
		System.out.println("------Dublicate Print------");
        for(Character key:allkeys)
        {
	      if(hs.get(key)>1)
	      {
		System.out.println(key+":"+hs.get(key));
	      }
        }

}
}