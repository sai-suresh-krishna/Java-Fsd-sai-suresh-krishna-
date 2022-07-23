package typecasting;

public class Typecasting {
	
		

			public static void main(String[] args) {
				
				
				
				//implicit conversion
				System.out.println("Implicit Type Casting");
				
				String s="ssk";
				System.out.println("given string is"+s);
				
				char a=s.charAt(0);
				System.out.println("Value of a: "+a);
				
				int b=a;
				System.out.println("Value of b: "+b);
				
				float c=a;
				System.out.println("Value of c: "+c);
				
				long d=a;
				System.out.println("Value of d: "+d);
				
				double e=a;
				System.out.println("Value of e: "+e);
				
						
				System.out.println("\n");
				
				System.out.println("Explicit Type Casting");
				//explicit conversion
				
				double n=23.7;
				int m=(int)n;
				System.out.println("Value of x: "+n);
				System.out.println("Value of y: "+m);
				
			}
		}



