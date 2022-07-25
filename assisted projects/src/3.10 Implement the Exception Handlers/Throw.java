package Exphandlers;

public class Throw extends Exception{ 
	
		   String str1;
		   Throw(String str2) {
			str1=str2;
		   }
		   public String toString(){ 
			return ("Exception Occurred: "+str1) ;
		   }
		}
		class Example1{
		   public static void main(String args[]){
			try{
				System.out.println("initiating the  try block");
				// I'm throwing the custom exception using throw
				throw new Throw("This is an error Message");
			}
			catch(Throw exp){
				System.out.println("Catch Block") ;
				System.out.println(exp) ;
			}
		   }
		


}

