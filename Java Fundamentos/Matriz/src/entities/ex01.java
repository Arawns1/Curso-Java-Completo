package entities;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the size of the matrix: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n ;i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
			
		}
		
		for(int i = 0; i < n ;i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(mat[i][j]);
			}
			
		}
		
		

	}

}

[
 [0, 1, 2],
 [3. 4. 5]
		 ]
		