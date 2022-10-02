package Arraylist;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;


public class Arraylist {
	public static void main(String args[]) {
	List ll= new ArrayList();
	ll.add(1);
	ll.add(3);
	ll.add(0);
	System.out.println(ll);
	for(Object i:ll) {   // by using for loop we can print the values in the array list independently.
		System.out.println(i);
	}
	

}
}