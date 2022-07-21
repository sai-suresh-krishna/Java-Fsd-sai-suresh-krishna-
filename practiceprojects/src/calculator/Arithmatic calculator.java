package calculator; 
	import java.util.Scanner; 
	import java.lang.*; 
	public class Calculator { 
	 public static void main(String args[]) { 
	 char operator; 
	 double num1,num2,result; 
	 Scanner input=new Scanner(System.in); 
	 boolean a=true; 
	 while(a) { 
	 System.out.println("select any one of the operator given below"); 
	 System.out.println("+ for addition" ); 
	 System.out.println("- for subraction"); 
	 System.out.println("* for multiplication"); 
	 System.out.println("/ for division"); 
	 System.out.println(" "); 
	 System.out.println("Type 0 to exit the calculator"); 
	 operator=input.next().charAt(0); 
	 if(operator=='0') { 
	 System.exit(0); 
	 } 
	 //user defined input of arthmatic operators. 
	 System.out.println("Enter the first number"); 
	 num1=input.nextDouble(); //user defined input of num1. 
	 System.out.println(" "); 
	 
	 System.out.println("Enter the second number"); 
	 num2=input.nextDouble(); //user defined input of num2. 
	 System.out.println(" "); 
	 
	 switch (operator) { //for processing the given input to required arithmetic operations. 
	 
	 case '+': 
	 result= num1 + num2; 
	 System.out.println("The result of " +num1+ " + " +num2 +" is = "+result); 
	 System.out.println(" "); 
	 break; //breaks the case. 
	 
	 case '-': 
	 result= num1 - num2; 
	 System.out.println("The result of "+num1 +" - "+num2 +" is = "+result); 
	 System.out.println(" "); 
	 break; 
	 
	 case '*': 
	 result= num1 * num2; 
	 System.out.println("The result of "+num1 +" * "+num2 +" is = "+result); 
	 System.out.println(" "); 
	 break; 
	 
	 
	 case '/': 
	 result= num1 / num2; 
	 System.out.println("The result of "+num1+" / "+num2+" is ="+result); 
	 System.out.println(" "); 
	 break; 
	 
	 default: 
	 System.out.println("Invalid operator ...Try again with a vaild operator "); 
	 System.out.println(" "); 
	 break; 
	 
	 } 
	 } 
	} 
	} 


