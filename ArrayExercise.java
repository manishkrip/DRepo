
//Find the maximum & minimum number in an array of integers. 











import java.util.*;
public class ArrayExercise {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the size of the array");
	int size = sc.nextInt();

	int array[]= new int[size];
	
	for(int i =0;i<size;i++)
	{
		array[i]= sc.nextInt();
	}
	int max = 0;
	int min = 0;
	for(int i=0;i<size;i++)
	{
		if(array[i]>max)
		{
			max = array[i];
								
		}
		if (array[i]<min)
		{
			min=array[i];
		}
	}
	System.out.println("The max and min value in the array is "+ max+" and "+min);
	
	
	int sorting[]= new int[size];
	
	for(int i =0;i<size;i++)
	{
		sorting[i]= sc.nextInt();
	}
	
	boolean isSort = true;
	
	for(int i=0;i<size-1;i++)
	{
	if(sorting[i]>sorting[i+1])
	{
		isSort = false;
	}	
		
	}
	
	if(isSort == true)
	{
		System.out.print("Array is sorted in ascending order");
	}
	else
	{
		System.out.print("Array is not sorted in ascending order");
	}
	
	
	
	
//  2 Take an array of numbers as input and check if it is an array sorted in ascending order.
//    Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//	  {3, 4, 6, 2} is not sorted in ascending order.
	
	
	
	
	
	
	
	
	
	
}
}
