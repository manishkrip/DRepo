import java.util.*;
public class Advance_Pattern3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for(int j=0;j<n-i;j++)
	        {
	        	System.out.print(" ");
	        }
			for(int j=i;j>=0;j--)
	        {
	        	System.out.print(j+1);
	        }
			if(i>0 && i<n)
			{
			for(int j=1;j<=i;j++)
	        {
	        	System.out.print(j+1);
	        }
			}
			System.out.println();
		}
	}
}
