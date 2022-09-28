package project5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class collections {

	public static void main(String[] args) {
		
				System.out.println("ArrayList");
				ArrayList<String> email=new ArrayList<String>();   
			      email.add("nandhini@gmail.com");//
			      email.add("bala@gmail.com");    	   
			      System.out.println(email);  
				
		
			      System.out.println("\n");
			      System.out.println("Vector");
			      Vector<Integer> id = new Vector();
			      id.addElement(01); 
			      id.addElement(02); 
			      System.out.println(id);
				
		
			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> name=new LinkedList<String>();  
			      name.add("Nandhini");  
			      name.add("Bala");  	      
			      Iterator<String> itr=name.iterator();  
			      while(itr.hasNext()){  
			       System.out.println(itr.next());  
			       
			       //creating hashset //print the value in order
			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(101);  
			       set.add(103);  
			       set.add(102);
			       set.add(104);
			       System.out.println(set);
			       
			       //creating linkedhashset // print the value in unorder
			       System.out.println("\n");
			       System.out.println("LinkedHashSet");
			       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();    
			       set2.add(11);  
			       set2.add(13);  
			       set2.add(12);
			       set2.add(14);	       
			       System.out.println(set2);
			      	} 
			      }  

	}


