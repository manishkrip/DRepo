import java.util.*;

public class Advance_Pattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int spaces = number;
		for (int i = number * 2; i >= 1; i--) {
			if (i > number) {
				for (int j = 1; j <= ((number * 2) - i) + 1; j++) {
					System.out.print("*");
				}

				for (int k = (((i-number)*2)-2); k >= 1; k--)

				{
					System.out.print(" ");

				}
				for (int j = 1; j <= ((number * 2) - i) + 1; j++) {
					System.out.print("*");

				}
				System.out.println();
			} else {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}

				for (int k = (number-i)*2 ; k>=1;k--)

				{
					System.out.print(" ");

				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");

				}
				System.out.println();
			}

		}
	}

}
