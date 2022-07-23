package Map;
import java.util.*;
public class Mapping {
	
	

		public static void main(String[] args) {
			// map
			
			//Hashmap
			HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		      hm.put(1,"suresh");    
		      hm.put(2,"sai");    
		      hm.put(3,"krishna");   
		       
		      System.out.println("\nThe elements of Hashmap are ");  
		      for(Map.Entry m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      
		     //HashTable
		       
		      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		      
		      ht.put(2,"rocky");  
		      ht.put(7,"jim hopper");  
		      ht.put(8,"Eleven");  
		      ht.put(9,"Dustin");  

		      System.out.println("\nThe elements of HashTable are ");  
		      for(Map.Entry n:ht.entrySet()){    
		       System.out.println(n.getKey()+" "+n.getValue());    
		      }
		      
		      
		      //TreeMap
		      
		      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(6,"Jason");    
		      map.put(9,"Martha");    
		      map.put(12,"Alexander");       
		      
		      System.out.println("\nThe elements of TreeMap are ");  
		      for(Map.Entry l:map.entrySet()){    
		       System.out.println(l.getKey()+" "+l.getValue());    
		      }    
		      
		   }  
	}



