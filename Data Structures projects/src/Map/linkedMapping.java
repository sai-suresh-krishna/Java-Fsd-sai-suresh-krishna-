package Map;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;



public class linkedMapping {
	public static void main(String[] args) {
		Map mm=new LinkedHashMap();   // maintains the order
		mm.put(3,"suresh");     // adding to the list ("indexvalue","element or string").
		mm.put(2,"ramesh");
		mm.put(1,"ssk");
		System.out.println(mm);
		mm.put(4,"rakesh");
		mm.put(5,"aaa");
		mm.put(2, "dinesh");    // it will not have duplicates it will replace the new value
		System.out.println(mm);
		System.out.println(mm.get(1));    // print the element with the index value given.
		System.out.println(mm.get(100));   // if the givenm infdex value is not there it displays null.
		System.out.println(mm.containsKey(1));// checks wether the list contains the index value one or not if contains it will give as true.
		System.out.println(mm.containsValue("suresh"));  //checks wether the list contains the element  or not if contains it will give as true
		
		
		
		
	}

}
