package Hasmap_Programs;

import java.util.HashMap;
import java.util.Set;

public class Sample_1
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> has = new HashMap<Integer,String>();
		has.put(101, "Ishuka");
		has.put(103, "Nayana");
		
		System.out.println(has.containsKey(101));    // True
		boolean result = has.containsKey(103);       //true
		System.out.println(result);
		
		System.out.println(has.get(101));     // Ishuka
		System.out.println(has.get(103));     // Nayana
		
		System.out.println("----get all keys---");
		Set<Integer> allkeys = has.keySet();
		for(Integer s1:allkeys)
		{
		System.out.println(s1);
		}
		
		System.out.println("---get all keys & Value---");
		Set<Integer> allkey = has.keySet();
		for(Integer s4:allkey)
		{
			System.out.println(s4+":"+has.get(s4));
		}
		
		
		
		
		
		
		
		
		
		
	}

}
