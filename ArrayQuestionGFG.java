import java.util.*;

public class ArrayQuestionGFG {

	// Write a program to reverse the array

	public void reverseArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the of the array ");
		int size = s.nextInt();
		int reverseArray[] = new int[size];
		System.out.println("Enter the value of the array ");
		for (int i = 0; i < size; i++) {
			reverseArray[i] = s.nextInt();
		}
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(reverseArray[i] + " ");
		}
	}
//--------------------------------------------------------------------------------------------------------------

	// K’th Smallest/Largest Element in Unsorted Array

	public void kthLargest() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the of the array ");
		int size = s.nextInt();
		int kthLargest[] = new int[size];
		System.out.println("Enter the value of the array ");
		for (int i = 0; i < size; i++) {
			kthLargest[i] = s.nextInt();
		}

		int min = 0;
		int temp;
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (kthLargest[j] < kthLargest[i]) {
					min = kthLargest[j];
					temp = kthLargest[i];
					kthLargest[i] = min;
					kthLargest[j] = temp;
				}
			}

		}
		for (int i = 0; i < kthLargest.length; i++) {
			System.out.println("Your array is " + kthLargest[i]);

		}
		System.out.println("Enter the kth element ");
		int kth = s.nextInt();

		System.out.print("The kth largest element is -> " + kthLargest[(kth - 1)]);

	}

	// ----------------------------------------------------------------------------------------------

	// Find Subarray with given sum
	public void subArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the of the array ");
		int size = s.nextInt();
		int subArray[] = new int[size];
		System.out.println("Enter the value of the array ");
		for (int i = 0; i < size; i++) {
			subArray[i] = s.nextInt();
		}
		System.out.println("Enter the subarray index from start to end position u want to calculate the sum");
		System.out.println("From ->");
		int start = s.nextInt();
		System.out.println("To ->");
		int end = s.nextInt();
		int current = 0;
		for (int i = start; i <= end; i++) {
			current = subArray[i] + current;
		}
		System.out.println("The sum of the sub arrey is " + current);
	}

	// ----------------------------------------------------------------------------------------------

	// Union and Intersection of two arrays

	public void intersectionArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size for the array1 ");
		int size = s.nextInt();
		int insArray1[] = new int[size];
		System.out.println("Enter the value of the array1 ");
		for (int i = 0; i < size; i++) {
			insArray1[i] = s.nextInt();
		}
int j=0;
for(int i=0;i<insArray1.length;i++)
{
	if(insArray1[i]!=insArray1[j])
	{
		insArray1[++j] = insArray1[i];
	}
}
++j;
for(int i=0;i<j;i++)
{
	System.out.println(insArray1[i]);
}
	}

	public static void main(String[] args) {
		ArrayQuestionGFG array = new ArrayQuestionGFG();
		array.reverseArray();
		array.kthLargest();
		array.subArray();
		array.intersectionArray();
	}
}
