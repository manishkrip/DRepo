import java.util.Scanner;

public class Practise {
	public static void arraymaxmin(int arr[], int size, int min, int max)

	{

		if (size == 0) {
			System.out.println("Max no. is " + max + " Min no. is " + min);
			return;
		}
		if (arr[size] > max) {
			max = arr[size];

		
		}
		if (arr[size] < min) {
			min = arr[size];

			
		}
		arraymaxmin(arr, size-1, min, max);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size of the array");
		int size = sc.nextInt();

		int array[] = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		int min = array[0];
		int max = array[0];
		arraymaxmin(array, size-1, min, max);

	}
}
