import java.util.*;
public class ArrayTranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of row");
		int row = sc.nextInt();
		System.out.println("enter the number of column");
		int col = sc.nextInt();
		int matrix[][] = new int[row][col];
		for (int i = 0; i < row; i++)

		{
			for (int j = 0; j < col; j++) {
              matrix[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++)

		{
			for (int j = 0; j < col; j++) {
              System.out.print(matrix[j][i]);
			}
			System.out.println();
		}
		
	}
}
