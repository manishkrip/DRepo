//Find the  number of ways of inviting n people in a party 
public class Recurssion15 {
	public static int invitation(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		
		int way1 = invitation(n-1);
		
		int way2 = (n-1) * invitation(n-2);
		return way1+way2;
	}
public static void main(String[] args) {
	int n=4;
	int output = invitation(n);
	System.out.println(output);
}
}
