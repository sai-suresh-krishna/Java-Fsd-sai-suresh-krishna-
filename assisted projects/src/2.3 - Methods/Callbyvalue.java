package Methods;

public class Callbyvalue {


		int val=90;

		int operation(int val) {
			val =val*100/1000;
			return(val);
		}

		public static void main(String args[]) {
			Callbyvalue d = new Callbyvalue();
			System.out.println("Before operation value of The data is "+d.val);
			d.operation(1000);
			System.out.println("After operation value of The data is "+d.val);
			}
		}



