package Map;
import java.util.HashMap;
import java.util.Map;



public class Mapping {
	public static void main(String[] args) {
		Map mm=new HashMap();
		mm.put(3,"suresh");
		mm.put(2,"ramesh");
		mm.put(1,"ssk");
		System.out.println(mm);
		mm.put(4,"rakesh");
		mm.put(5,"aaa");
		System.out.println(mm);
		System.out.println(mm.get(1));
		System.out.println(mm.get(100));
		System.out.println(mm.containsKey(1));
		System.out.println(mm.containsValue("suresh"));
		
		
		
		
		
	}

}
