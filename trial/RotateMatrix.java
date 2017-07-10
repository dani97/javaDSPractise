package trial;

import java.util.Scanner;

public class RotateMatrix {
	public static void print(int [][] matrix,int n){
		int i,j;
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int [][] rotate(int [][] matrix,int n){
		int [][] matrix1 = new int[n][n];
		int i,j;
		for(i=0;i<n;i++){
			for (j=0;j<n;j++){
				matrix1[i][j] = matrix[n-j-1][i];
			}
		}
		return matrix1;
		
	}
	
	public static int[][] rotate1(int [][] matrix,int n){
		for(int layer=0;layer<n/2;layer++){
			int first = layer;
			int last = n-1-layer;
			for(int i = first;i<last;i++){
				int offset = i-first;
				System.out.println( "rotate" + matrix[first][i]+" "+matrix [last-offset][first]+" "+matrix[last][last-offset]+" "+matrix[i][last]);

				int top = matrix[first][i];
				matrix[first][i] = matrix [last-offset][first];
				matrix[last-offset][first] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[i][last];
				matrix[i][last] = top;
				
			}
		}
		return matrix;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] matrix = new int [n][n];
		int i,j;
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				matrix[i][j] = sc.nextInt();
			}
			sc.nextLine();	
		}
		sc.close();
		print(matrix,n);
		System.out.println("After rotate");
		print(rotate(matrix,n),n);
		System.out.println("After rotate1");
		print(rotate1(matrix,n),n);
	}

}
