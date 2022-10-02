package Demolinkedlist;
import java.util.LinkedList;
public class Demolinkedlist {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);    // adds to the list
		ll.add(30);
		ll.add(1,100);  // adds 100 to the first index position
		System.out.println(ll);
		ll.remove(2);      // remove the value in second index
		System.out.println(ll);
		ll.addFirst(1);     // adds to the starting 
			ll.addLast(2);
			System.out.println(ll);
			ll.removeFirst();   //removes the starting value
			ll.removeFirst();
			System.out.println(ll);
			
		
	}

}
