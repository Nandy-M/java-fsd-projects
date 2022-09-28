package project6;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class map {

	public static void main(String[] args) {
	
				//Hashmap
				 HashMap<Integer,String> hm=new HashMap<Integer,String>();      
			      hm.put(1,"Nandhu");    
			      hm.put(2,"Kavi");    
			      hm.put(3,"Siva");   
			       
			      System.out.println("\nThe elements of Hashmap are ");  
			      for(Map.Entry m:hm.entrySet()){    
			       System.out.println(m.getKey()+" "+m.getValue());    
			      }
			      
			     //HashTable  integer print higher order to lower order
			       
			      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
			      
			      ht.put(4,"Bala");  
			      ht.put(5,"Moni");  
			      ht.put(6,"Anitha");  
			      ht.put(7,"Nami");  

			      System.out.println("\nThe elements of HashTable are ");  
			      for(Map.Entry n:ht.entrySet()){    
			       System.out.println(n.getKey()+" "+n.getValue());    
			      }
			      
			      
			      //TreeMap
			      
			      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
			      map.put(8,"Vimal");    
			      map.put(9,"Sandy");    
			      map.put(10,"Arun");       
			      
			      System.out.println("\nThe elements of TreeMap are ");  
			      for(Map.Entry l:map.entrySet()){    
			       System.out.println(l.getKey()+" "+l.getValue());    
			      }    
			      
			   }  


	}


