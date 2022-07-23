package Methods;

public class Methods {
	

		public int Multiply(int a,int b) {
			int z=a*b;
			return z;
		}

		public static void main(String[] args) {

			Methods b=new Methods();
			int ans= b.Multiply(8,2);
			System.out.println("Multipilcation is :"+ans);
			}



}

