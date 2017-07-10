package trial;

import java.util.Scanner;

public class ZeroMatrix {
	public static void print(int [][] matrix,int m,int n){
		int i,j;
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int [][] matrix = new int [m][n];
		int i,j;
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				matrix[i][j] = sc.nextInt();
			}
			sc.nextLine();	
		}
		sc.close();
		print(matrix,m,n);
		print(zeroMe(matrix,m,n),m,n);
	}
	private static int[][] zeroMe(int[][] matrix, int m, int n) {
		// TODO Auto-generated method stub
		boolean zrow [] = new boolean[m];
		boolean zcol [] = new boolean[n];
		for(int i = 0 ;i<m;i++)
			for(int j=0;j<n;j++){
				if(matrix[i][j]==0){
					zrow[i] = true;
					zcol[j] = true;
				}
			}
		for(int i=0;i<m;i++)
		{
			if(zrow[i]){
				for(int j=0;j<n;j++){
					matrix[i][j]=0;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(zcol[i]){
				for(int j=0;j<m;j++){
					matrix[j][i]=0;
				}
			}
		}
		return matrix;
		
	}
	
}
