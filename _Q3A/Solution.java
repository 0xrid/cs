import java.util.Scanner;

public class Solution {

	public static int[][] trimDiag(int[][] matrix) {
		// Write your code here
		// Enable AutoSave option in VS Code
		int[][] newArr = new int[matrix.length][matrix.length-1];


		for(int i = 0 ; i < matrix.length; i++)
		{
			int count = 0;
			for(int j = 0 ; j < matrix.length ; j++)
			{
				if (i!=j) {
					newArr[i][count] = matrix[i][j];
					count++;
				}
			}
		}
			return newArr;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input: number of rows and number of columns of the matrix
		// (equal, since it is guaranteed to be a square matrix)
		int rows = scanner.nextInt();
		int cols = scanner.nextInt();

		// Input: the matrix itself, read row by row
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		// Pass the matrix to trimDiag() and catch the returned new matrix
		int[][] newMatrix = trimDiag(matrix);

		// Output: print the returned matrix, space-separated values per row
		for (int i = 0; i < newMatrix.length; i++) {
			for (int j = 0; j < newMatrix[i].length; j++) {
				System.out.print(newMatrix[i][j] + " ");
			}
			System.out.println();
		}

		scanner.close();
	}
}