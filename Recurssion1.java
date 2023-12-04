import java.util.*;
public class Recurssion1 
{
	static int i=1;
	static int sum=0;
	public static void printNaturalSum(int n)
	{
		if(i>n)
		{
			System.out.print(sum+ " ");
			return;
		}
		
		sum+=i;
		i++;
		printNaturalSum(n);
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n= s.nextInt();
	printNaturalSum(n);
}
}
