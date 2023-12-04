import java.util.*;

public class Array2D {

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
		System.out.println("enter the nmber u want search that indices");
		int number = sc.nextInt();
		for (int i = 0; i < row; i++)

		{
			for (int j = 0; j < col; j++) {
              if(matrix[i][j] == number)
            	  System.out.println("The indices of that number is (" + (i+1)+","+(j+1)+")");
			}
		}

		
		
	}
}
