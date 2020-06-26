package Topic4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class Assignment4{
	public static void main(String args[])  
	{  
		Scanner sc=new Scanner(System.in);

		HashMap<String,String> hm = new HashMap<String,String>();   
		hm.put("Ram","9817986960");  
		hm.put("Preethi","9228899523");  
		hm.put("Dinesh","9747397415");    
		hm.put("Komal","9534223856");  
		hm.put("Pavani","9573332743");  

		System.out.println("Enter a name: ");
		String name=sc.next();

		Iterator <String> it = hm.keySet().iterator();  

		while(it.hasNext())  
		{  
			String key=it.next(); 
			if(name.equals(key))
				System.out.println("Contact of " +name+ " : " +hm.get(name));  
		} 

	}  
}  