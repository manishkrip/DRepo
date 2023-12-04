import java.util.*;
public class Advance_Pattern4 {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	int count =1;
	for(int i = 1 ;i<= (number*2);i++ )
	{
		
		if(i<=(number))
		{
		for(int j=(number-i) ; j>=1;j--)
		{
			System.out.print(" ");
		}
		for(int j=(2*i)-1;j>=1;j--)
		{
			System.out.print("*");
		}
		}
		else
		{
			
			for(int j=number - ((i-((count*2)-1))) ; j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=(2*(i-((count*2)-1)))-1;j>=1;j--)
			{
				System.out.print("*");
				
			}
			
			count++;
		}
		
		System.out.println();
	}
}
}
