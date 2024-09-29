package b66;

import java.util.Scanner;

public class matrix {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	int n= sc.nextInt();
	int m=sc.nextInt();
	int[][] matrix= new int[n][m];
	int[][] matrix2= new int[n][m];
	int[][] matrix3= new int[n][m];
	for(int i=0; i<n; i++) {
		for(int j=0; j<m; j++) {
			matrix[i][j]=sc.nextInt();
			matrix2[i][j]=sc.nextInt();
			matrix3[i][j]=matrix[i][j]+matrix2[i][j];
		}
	}
	
	for(int i=0; i<n; i++) {
		for(int j=0; j<m; j++){
			System.out.print(matrix3[i][j]+" ");
		}
		System.out.println();
	}
	
	}
}
