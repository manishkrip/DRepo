import java.util.*;
//Place the tiles 1*m size on the floor of n*m size
public class Recurssion14 {
	public static int placeTile(int n,int m)
	{
		if(m==n)
		{
			return 2;
		}
		if(n<m)
		{
			return 1;
		}
		 int vertical = placeTile(n-m, m);
		 int horizontal = placeTile(n-1, m);
		 return vertical+horizontal;
	}
public static void main(String[] args) {
	int m=2,n=4;
	int tile = placeTile(n, m);
	System.out.println(tile);
}
}
