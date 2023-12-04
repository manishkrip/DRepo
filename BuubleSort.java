import java.util.*;

public class BuubleSort {
	public static void printarray(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" The count of number you want to enter");
		int size = s.nextInt();

		int numbers[] = new int[size];

		for (int i = 0; i < size; i++) {
			numbers[i] = s.nextInt();
		}
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}

			}

		}
		printarray(numbers);
	}

}
