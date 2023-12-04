import java.util.*;
public class InsertionSort {
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
	
	for(int i=1;i<size;i++)
	{
		int n = numbers[i];
		int j = i-1;
		while(j>=0 && n<numbers[j])
		{
			numbers[j+1] = numbers[j];
			j--;
		}
		numbers[j+1] =n;
		}
	printarray(numbers);

}
}
