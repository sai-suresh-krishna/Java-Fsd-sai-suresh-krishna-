package Stack;

public class Stk {
	  	static final int MAX = 1000; 
	    	int top; 
	    	int n[] = new int[MAX];  
	  	boolean isEmpty() 
	    	{ 
	        		return (top < 0); 
	    	} 
	  	Stk() 
	    	{ 
	        		top = -1; 
	    	} 
	  	boolean push(int x) 
	    	{ 
	        		if (top >= (MAX-1)) 
	        		{ 
	            			System.out.println("Stack Overflow"); 
	            			return false; 
	        		} 
	        		else
	        		{ 
	            			n[++top] = x; 
	            			System.out.println(x + " pushed into stack"); 
	            			return true; 
	        		} 
	    	} 
	int pop() 
	    	{ 
	        		if (top < 0) 
	        		{ 
	            			System.out.println("Stack Underflow"); 
	            			return 0; 
	        		} 
	        		else
	        		{ 
	            			int x = n[top--]; 
	            			return x; 
	        		} 
	    	} 
	    
	    	public static void main(String args[])
	{
	    		Stk stk = new Stk(); 
	        		stk.push(1); 
	        		stk.push(10); 
	        		stk.push(100); 
	        		System.out.println(stk.pop() + " Popped from stack"); 
	    	}
	} 	



