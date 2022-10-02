package Arraylist;
import java.util.ArrayList;
import java.util.List;

public class Collectionwithgenerics {
public static void main(String args[]) {
	List ll1 =new ArrayList();
	ll1.add(2);
	ll1.add(3.10);
	ll1.add("suresh");
	ll1.add(true);
	Object obj=ll1.get(0);
	Integer i=(Integer)obj;
	int n=i.intValue();
	System.out.println(n);
	
}
}
