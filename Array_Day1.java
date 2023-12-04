import java.util.*;
public class Array_Day1 {
// Linear search 
	public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	int size = sc.nextInt();
	int number[]= new int[size];
	for(int i=0;i<size;i++)
	{
		number[i] = sc.nextInt();
	}
	System.out.println("Enter the number so i can found the index number for you");
	int search_index = sc.nextInt();
	for(int i=0;i<number.length;i++)
	{
		if(number[i] == search_index)
		{
			System.out.println("Here is your index number "+i);
		}
	}
}
}
