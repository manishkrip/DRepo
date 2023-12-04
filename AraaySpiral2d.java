import java.util.*;

public class AraaySpiral2d {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of rows");
		int row = s.nextInt();
		System.out.println("Enter number of column");
		int col = s.nextInt();

		int arraySpiral[][] = new int[row][col];

		int rowstart = 0;
		int rowend = row - 1;
		int colstart = 0;
		int colend = col - 1;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arraySpiral[i][j] = s.nextInt();
			}
		}
		//i -> col
		//j -> row
		while(rowstart<=rowend && colstart<=colend)
		{
			for(int i=colstart; i<=colend;i++)
			{
				System.out.print(arraySpiral[rowstart][i]+" ");
			}
			rowstart++;
			
			for(int j=rowstart;j<=rowend;j++)
			{
				System.out.print(arraySpiral[j][colend]+" ");
			}
			colend--;
			for(int i =colend;i>=colstart;i--)
			{
				System.out.print(arraySpiral[rowend][i]+" ");
			}
			rowend--;
			for(int j=rowend;j>=rowstart;j--)
			{
				System.out.print(arraySpiral[j][colstart]+" ");
			}
			colstart++;
		}
		
		
		
	}
}
