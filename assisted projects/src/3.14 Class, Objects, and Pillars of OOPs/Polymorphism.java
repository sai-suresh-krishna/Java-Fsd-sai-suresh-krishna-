package classandobj;

public class Polymorphism {
		    public int Polymorphism(int a, int b) 
	    { 
	        return (a + b); 
	    } 
	    public int sum(int a, int b, int c) 
	    { 
	        return (a + b + c); 
	    } 
	    public double sum(double a, double b) 
	    { 
	        return (a + b); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	Polymorphism s = new Polymorphism(); 
	        System.out.println(s.Polymorphism(10, 20)); 
	        System.out.println(s.sum(8, 30, 34)); 
	        System.out.println(s.sum(15.5, 22.5)); 
	    } 
	}



