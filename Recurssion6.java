import java.util.*;
public class Recurssion6 {
	//Check if the array is sorted (Strictly sorted )
	public static boolean isSorted(int arr[], int indx)
	{
		if(arr.length-1==indx)
		{
			return true;
		}
		if(arr[indx]<arr[indx+1])
		{
		return	isSorted(arr, indx+1);
		}
		else
		{
		return false;
		}
		
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size = s.nextInt();
		int arr[]= new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = s.nextInt();
		}
		
		
		
		boolean output = isSorted(arr, 0);
		System.out.println(output);
	}
}
