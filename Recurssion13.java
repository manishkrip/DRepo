import java.util.*;
//Print the total path from moving (0,0) to (m,n)
public class Recurssion13 {
	
	public static int path(int m, int n,int i , int j)
	{
		if(i== m || j== n)
		{
			return 0;
		}
		
		if(i== m-1 && j== n-1)
		{
			return 1;
		}
		int downpath = path(m,n,i+1,j);
		int rightpath = path(m,n,i,j+1);
		return downpath+rightpath;
	}
public static void main(String[] args) {
	int m=3;
	int n=3;
	
	int total_path = path(m,n,0,0);
	System.out.println(total_path);
}
}
