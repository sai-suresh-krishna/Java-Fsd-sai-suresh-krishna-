package Firstproject;

public class Arthematicoperator {
public static void main(String args[]) {
	int a=8,b=6;
	int a1=a-b;
	int a2=a+b;
	int a3=a*b;
	double a4=(double)a/b;// for quotient
	double a5 =(double)a%b;//for reminder
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a4);
	System.out.println(a5);
	a+=b;// this is equal to a=a+b;
	System.out.println(a);
	
	a++;//incrementing a value by 1 this is equals to a+1
	System.out.println(a);
	a--;
	System.out.println(a);
	++a;//pre increment increment by 1
	System.out.println(a);
}
}
