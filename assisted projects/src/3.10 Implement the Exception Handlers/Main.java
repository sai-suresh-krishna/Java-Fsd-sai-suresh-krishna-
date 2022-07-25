package Exphandlers;

class Exceptionexp extends Exception 
{ 
    public Exceptionexp (String s) 
    { 
        super(s); 
    } 
} 	

	public class Main 
	{ 
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            throw new Exceptionexp ("temp"); 
	        } 
	        catch (Exceptionexp  ex) 
	        { 
	            System.out.println("Caught"); 
	            System.out.println(ex.getMessage()); 
	        } 
	    } 
	}



