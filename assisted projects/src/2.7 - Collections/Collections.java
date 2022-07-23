package Collections;
import java.util.*;
public class Collections {
	

	
		public static void main(String[] args) {
			
			System.out.println("ArrayList");
			ArrayList<String> city=new ArrayList<String>();     //array list
		      city.add("Pune");//
		      city.add("Hyderabad");    	   
		      System.out.println(city);  
			
			
		      System.out.println("\n");
		      System.out.println("Vector");                      //vector creation
		      Vector<Integer> vec = new Vector();
		      vec.addElement(20); 
		      vec.addElement(40); 
		      System.out.println(vec);
			
			
		      System.out.println("\n");
		      System.out.println("LinkedList");
		      LinkedList<String> names=new LinkedList<String>();   //linked list
		      names.add("suresh");  
		      names.add("ramesh");  	      
		      Iterator<String> itr=names.iterator();  
		      while(itr.hasNext()){  
		       System.out.println(itr.next());  
		       
		       
		       System.out.println("\n");
		       System.out.println("HashSet");
		       HashSet<Integer> set=new HashSet<Integer>();    //hash set
		       set.add(65);  
		       set.add(77);  
		       set.add(88);
		       set.add(99);
		       System.out.println(set);
		       
		      
		       System.out.println("\n");                     // Linked hash set
		       System.out.println("LinkedHashSet");
		       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
		       set2.add(15);  
		       set2.add(16);  
		       set2.add(17);
		       set2.add(18);	       
		       System.out.println(set2);
		      	} 
		      }  
		}



