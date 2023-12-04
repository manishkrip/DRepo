import java.util.Arrays;

public class Practice {
	public static int removeDuplicateElements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 4, 4, 5, 6 };// unsorted array
		Arrays.sort(arr);// sorting array
		int length = arr.length;
		length = removeDuplicateElements(arr, length);

		int arr1[] = { 1, 2, 3, 3 };// unsorted array
		Arrays.sort(arr1);// sorting array
		int length1 = arr1.length;
		length1 = removeDuplicateElements(arr1, length1);
		int m = 0;
		int temp[] = new int[Math.min(length, length1)];
		 for (int i = 0; i < length; i++) {
	            for (int j = 0; j < length1; j++) {
	                if (arr[i] == arr1[j]) {
	                    temp[m++] = arr[i];
	                }
	            }
	        }

	
		for (int i = 0; i < temp.length; i++)
			System.out.print(temp[i] + " ");
	}
}
