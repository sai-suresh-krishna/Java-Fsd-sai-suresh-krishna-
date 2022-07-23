package Innerclass;

public class Innerclass1 {
	
		 private String msg="This is Java programing"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", The Inner Classes");}  
		 }  


		public static void main(String[] args) {

			Innerclass1 obj=new Innerclass1();
			Innerclass1.Inner in=obj.new Inner();  
			in.hello();  
		}
	}





