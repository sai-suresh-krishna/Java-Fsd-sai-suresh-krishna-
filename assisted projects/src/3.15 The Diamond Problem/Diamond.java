package diamond;


	interface First 
	{  
	    default void show() 
	    { 
	        System.out.println("First Default"); 
	    } 
	} 
	interface Second 
	{  
	    default void show() 
	    { 
	        System.out.println("Second Default"); 
	    } 
	}  
	public class Diamond implements First, Second 
	{  
	    public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	Diamond ob = new Diamond(); 
	        ob.show(); 
	    } 
	}



