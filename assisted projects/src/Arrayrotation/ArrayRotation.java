package Arrayrotation;


	class RotateionofArray { 
		public void rotate(int[] num, int A) {
		    		if(A > num.length) 
		       			A=A%num.length;
		 		int[] result = new int[num.length];
		 		for(int i=0; i < A; i++){
		        			result[i] = num[num.length-A+i];
		 		}
		 		int j=0;
		    		for(int i=A; i<num.length; i++){
		        			result[i] = num[j];
		j++;
		    		}
		 		System.arraycopy( result, 0, num, 0, num.length );
		}
		} 
	public class ArrayRotation {
		
			public static void main(String[] args) {
				RotateionofArray r = new RotateionofArray();
		        		int arr[] = { 4,5,6,7,8,9,2,1,3 }; 
		        		r.rotate(arr, 5); 
		        		for(int i=0;i<arr.length;i++){
		            			System.out.print(arr[i]+" ");
		        		}
			}
		}



