import java.util.*;
public class Recusrrion4 {
//Q6. Print x^n (with stack height = n)
	public static int printPower(int x, int n) {
		if(n == 0) {
		return 1;
		}
		if(x == 0) {
		return 0;
		}
		int x_ = printPower(x, n-1);
		int xn = x * x_;
		return xn;
		}
	
	
	
//Q7. Print x^n (with stack height = logn)
	
	public static int printPowerl(int x, int n) {
		if(n == 0) {
		return 1;
		}
		if(n % 2 == 0) {
		return printPower(x, n/2) * printPower(x, n/2);
		}
		else {
		return x * printPower(x, n/2) * printPower(x, n/2);
		}
		}
	
public static void main(String[] args) {
	int x = 2, n = 5;
	int output = printPower(x, n);
	System.out.println(output);

	int output1 = printPowerl(x, n);
	System.out.println(output1);
}
}
