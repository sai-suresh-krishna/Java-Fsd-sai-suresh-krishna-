package Matrix;

public class Thematrix {
	
	public static void main(String[] args) 
	{
	       		int a1 = 2, b1 = 3;
	        		int a2 = 3, b2 = 2;
	        		int[][] firstMatrix = { {5, 3, -2}, {5, 1, 6} };
	        		int[][] secondMatrix = { {1, 7}, {-3, 5}, {0, 3} };
	int[][] product = multiplyMatrices(firstMatrix, secondMatrix, a1, b1, b2);
	displayProduct(product);
	    	}

	public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int a1, int b1, int b2) 
	{
	        		int[][] product = new int[a1][b2];
	        		for(int i = 0; i < a1; i++) 
	{
	            			for (int j = 0; j < b2; j++) 
	{
	                			for (int k = 0; k < b1; k++) 
	{
	                    				product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
	                			}
	            			}
	       	 	}
	return product;
	    	}
	public static void displayProduct(int[][] product) 
	{
	        		System.out.println("The Product of the two matrices is: ");
	        		for(int[] row : product) 
	{
	            			for (int column : row) 
	{
	                			System.out.print(column + "    ");
	            			}
	            			System.out.println();
	        		}
	    	}
	}


