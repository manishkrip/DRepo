import java.util.*;
public class Recurssion {
	static int i=1;
	public static void printNumber(int n)
	{
		
		if (i>n) {
			return;
		}
		System.out.println(i);
		i++;
		printNumber(n);
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println(" Enter the number of count you want to print");
	int count = s.nextInt();
	printNumber(count);

}
}
