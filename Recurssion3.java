import java.util.*;
//Print the Fabonacci series


public class Recurssion3 {
	static int i=0;
	static int j=0;
public static void fabonacci(int n)
{
	if(n<=1)
	{
		return;
	}
	if(i==0)
	{
		i++;
		  System.out.print(j+" "+i);
	}
	else
	{
	int sum =0;
	int temp=0;
	  
	sum = i+j;
	System.out.print(" "+sum);
	temp=i;
	i=sum;
	j=temp;
	}
	
	fabonacci(n-1);
}
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	fabonacci(n);
}
}
