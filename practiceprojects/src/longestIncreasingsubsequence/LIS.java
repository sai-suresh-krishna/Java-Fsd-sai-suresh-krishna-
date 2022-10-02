package longestIncreasingsubsequence;
import java.util.Scanner;
	public class LIS {
	 public int[] lis(int[] A)
	    {        
	        int n = A.length ;
	        int[] x = new int[n + 1];  
	        int[] y = new int[n + 1]; 
	        int L = 0;
	 
	        for (int i = 1; i < n ; i++)
	        {
	            int j = 0;
	 
	 
	            for (int pos = L ; pos >= 1; pos--)
	            {
	                if (A[x[pos]] < A[i])
	                {
	                    j = pos;
	                    break;
	                }
	            }            
	            y[i] = x[j];
	            if (j == L || A[i] < A[x[j + 1]])
	            {
	                x[j + 1] = i;
	                L = Math.max(L,j + 1);
	            }
	        }
	 
	       int[] result = new int[L];
	        int pos = x[L];
	        for (int i = L - 1; i >= 0; i--)
	        {
	            result[i] = A[pos];
	            pos = y[pos];
	        }
	        return result;             
	    }
	 
	    public static void main(String[] args) 
	    {    
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Enter number of elements");
	        int n = scan.nextInt();
	        int[] arr = new int[n + 1];
	        System.out.println("\nEnter "+ n +" elements");
	        for (int i = 1; i <= n; i++)
	            arr[i] = scan.nextInt();
	 
	        LIS obj = new LIS(); 
	        int[] result = obj.lis(arr);       
	 
	        System.out.print("\nLongest Increasing Subsequence  is : ");
	        for (int i = 0; i < result.length; i++)
	            System.out.print(result[i] +" ");
	        System.out.println();
	        
	        System.out.println("\nLength of the longest increasing subsequence is : "+result.length);
	    }
	}