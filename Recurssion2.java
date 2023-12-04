import java.util.*;

//Print factorial of a number with the recurssion
public class Recurssion2 {

	public static int facct(int n)
	{
		if(n==1 || n==0)
		{
			return 1;
		}
		int nm1 = facct(n-1);
	int factn = n*nm1;
		return factn;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int output = facct(n);
		System.out.println(output);

	}

}
