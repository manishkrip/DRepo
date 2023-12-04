import java.util.*;

public class Selectionsort {

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
			int smallest = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[smallest] > numbers[j]) {
					smallest = j;

				}

			}
			int temp = numbers[smallest];
			numbers[smallest] = numbers[i];
			numbers[i]=temp;

		}
		printarray(numbers);
	}
}
