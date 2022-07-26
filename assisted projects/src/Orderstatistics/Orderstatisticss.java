package Orderstatistics;


	class KthSmallst 
	{ 
	int kthSmallest(int arr[], int a, int b, int K) 
	    	{ 
	             		if (K > 0 && K <= b - a + 1) 
	        		{ 
	            			int pos = randomPartition(arr, a, b); 
	            			if (pos-a == K-1) 
	                			return arr[pos]; 
	            			if (pos-a > K-1) 
	                			return kthSmallest(arr, a, pos-1, K); 
	            			return kthSmallest(arr, pos+1, b, K-pos+a-1); 
	        		} 
	        return Integer.MAX_VALUE; 
	    } 
	    void swap(int arr[], int i, int j) 
	    { 
	        int temp = arr[i]; 
	        arr[i] = arr[j]; 
	        arr[j] = temp; 
	    } 
	    int partition(int arr[], int l, int r) 
	    { 
	        int x = arr[r], i = l; 
	        for (int j = l; j <= r - 1; j++) 
	        { 
	            if (arr[j] <= x) 
	            { 
	                swap(arr, i, j); 
	                i++; 
	            } 
	        } 
	        swap(arr, i, r); 
	        return i; 
	    } 
	    int randomPartition(int arr[], int l, int r) 
	    { 
	        int n = r-l+1; 
	        int pivot = (int)(Math.random()) * (n-1); 
	        swap(arr, l + pivot, r); 
	        return partition(arr, l, r); 
	    } 
	}  
	public class Orderstatisticss {
	
		public static void main(String[] args) {
			KthSmallst ob = new KthSmallst(); 
	        int arr[] = {1,2,6,5,7,9,3,0,8}; 
	        int n = arr.length,k = 4; 
	        System.out.println("K'th smallest element is "+ ob.kthSmallest(arr, 0, n-1, k)); 
	    }
	}



