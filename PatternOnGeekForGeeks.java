import java.util.Scanner;

public class PatternOnGeekForGeeks {

	// Square Hallow Pattern

	public void hollowSquare() {

		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		for (int j = 0; j < i; j++) {
			for (int k = 0; k < i; k++) {
				if (j == 0 || k == 0 || i == j + 1 || i == k + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
	// ----------------------------------------------------------------------------------------------

	// Number Triangular

	public void numberTriangular() {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int x = i;
		for (int j = 1; j <= i; j++) {
			for (int k = 0; k < i; k++) {
				if (x <= k + 1) {
					System.out.print(j + " ");
				} else {
					System.out.print(" ");
				}
			}
			x--;
			System.out.println();
		}
	}

	// ----------------------------------------------------------------------------------------------

// Number increasing Pyramid
	public void numberIncreasingPyramid() {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		for (int j = 1; j <= i; j++) {
			for (int k = 1; k <= j; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}
//-------------------------------------------------------------------------------------------------

	// Number changing Pyramid
	public void numberChangingPyramid() {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int x = 1;
		for (int j = 1; j <= i; j++) {
			for (int k = 1; k <= j; k++) {
				System.out.print(x + " ");
				x++;
			}
			System.out.println();
		}

	}
//---------------------------------------------------------------------------------------------------

	// Number increasing Reverse Pyramid
	public void numberIncreasingReversePyramid() {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		for (int j = 4; j >= 1; j--) {
			for (int k = 1; k <= j; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

//-----------------------------------------------------------------------------------------------

	// Zero one triangle

	public void zeroOneTriangle() {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		for (int j = 0; j < i; j++) {
			for (int k = 0; k <= j; k++)

			{
				if ((k + j) % 2 == 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

	// ---------------------------------------------------------------------------------------------

// Pallindrome Triangular

	public void pallindromeTringular() {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int x = i;
		for (int j = 1; j <= i; j++) {
			int y = j;
			int z = 2;
			for (int k = 1; k <= (2 * i - 1); k++) {

				if (x > k) {

					System.out.print(" ");

				}
				if (i >= k) {
					if (x <= k) {

						System.out.print(y);
						y--;

					}
				} else {

					if (j >= z) {

						System.out.print(z);
						z++;

					}
				}

			}

			x--;
			System.out.println();
		}

	}
//-----------------------------------------------------------------------------------------------
	// Diamond Pattern

	public void diamondPattern() {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int x = i/2;
		int z = 1;
		for (int j = 1; j <= i; j++) {
					
			for (int k = 1; k <= i; k++) {
				if(i%2==0)
				{
				if ((i/2) >= j && (i/2) >= k ) {
					
					if (x > k) {

						System.out.print(" ");

					}
					else  {

						System.out.print("* ");
						

					}
                   
				}
				else if(j>i/2 && k>i/2)
				{
					if(j>((i/2)+1) && (j-k)>=1 )
					{
					System.out.print(" ");
					}
					else 
					{
					System.out.print("* ");
					}
				}
			
				}
				else
				{
					if ((i/2) >= j && (i/2) >= k ) {
						if(k==1)
						{
							System.out.print(" ");
						}
						if (x > k) {

							System.out.print(" ");

						}
						
						else  {
							
							System.out.print("* ");
							

						}
	                   
					}
					else if(j>i/2 && k>i/2)
					{
						if(j>=((i/2)+1) && (j-k)>=1 )
						{
						System.out.print(" ");
						}
						else 
						{
						System.out.print("* ");
						}
					}
				
				}
			}
			
			x--;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternOnGeekForGeeks pattern1 = new PatternOnGeekForGeeks();
		pattern1.hollowSquare();
		pattern1.numberTriangular();
		pattern1.numberIncreasingPyramid();
		pattern1.numberChangingPyramid();
		pattern1.numberIncreasingReversePyramid();
		pattern1.zeroOneTriangle();
		pattern1.pallindromeTringular();
		pattern1.diamondPattern();
	}
}
