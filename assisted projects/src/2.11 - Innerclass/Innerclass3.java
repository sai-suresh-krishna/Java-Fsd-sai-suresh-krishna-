package Innerclass;

abstract class aninnerclass {
	   public abstract void display();
	}


	public class Innerclass3 {

	public static void main(String[] args) {
	aninnerclass i = new aninnerclass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }
	}
