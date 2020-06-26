package Topic4;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment5 {

	public static void main(String args[]){  
	    HashSet<String> set=new HashSet();  
	           set.add("Manasa");    
	           set.add("youvaneca");    
	           set.add("harika");   
	           set.add("Teju");  
	           set.add("Roshni"); 
	 
	           Iterator<String> i=set.iterator(); 
	            System.out.println ("Employees: ");

	           while(i.hasNext())  
	           {  
	           System.out.println(i.next());  
	           }  
	 }  

}
