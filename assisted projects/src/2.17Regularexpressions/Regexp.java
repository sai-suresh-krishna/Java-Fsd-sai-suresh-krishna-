package Regularexpressions;
import java.util.regex.*;

public class Regexp {
	
	

	public static void main(String[] args) {

		String pattern = "[a-z]+";
		String check = "Regular Expressions Assisted";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );
		}
}




