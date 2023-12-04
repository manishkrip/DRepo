import java.util.*;

public class Function_Exercise {

	// 1 Enter 3 numbers from the user & make a function to print their average.

	public static int averagesum(int a, int b, int c) {
		int sum = a + b + c;
		int average = sum / 3;
		return average;
	}

	// 2 Write a function to print the sum of all odd numbers from 1 to n
	public static int sumOdd(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				sum = i + sum;
			}
		}
		return sum;
	}

	// 3 Write a function which takes in 2 numbers and returns the greater of those
	// two.
	public static int greater(int a, int b) {
		if (a > b) {
			return a;
		} else if (b > a) {
			return b;
		} else {
			return 0;
		}

	}

	// 4 Write a function that takes in the radius as input and returns the
	// circumference of a circle.
	public static void circumstanceCircle(float r) {
		float circum = (float) (2 * Math.PI * r);
		System.out.println(circum);
	}

// 5 Write a program to enter the numbers till the user wants and at the end it should display 
//   the count of positive, negative and zeros entered. 

	public static String userNumber(int user) {
		int positive = 0;
		int negative = 0;
		int zeros = 0;
		for (int i = 1; i <= user; i++) {
			Scanner s = new Scanner(System.in);
			int j = s.nextInt();

			if (j >= 1) {
				positive++;
			} else if (j < 0) {
				negative++;
			} else {
				zeros++;
			}
		}
		return " Number of positive enter by user - " + positive + " Number of negative enter by user - " + negative
				+ " Number of zeros enter by user - " + zeros;
	}

	// 6 Two numbers are entered by the user, x and n. Write a function to find the
	// value of one number raised to the power of another i.e. xn.
	public static void powerAnother(int x, int y) {
		int constant = x;
		for (int i = 1; i <= y - 1; i++) {
			x = x * constant;
		}
		System.out.println("The power of x is y and output is " + x);
	}

	// 7 Write a function that calculates the Greatest Common Divisor of 2 numbers.
	// (BONUS)
	public static String greatestCommonDivisor(int num1,int num2)
	{
		int count=1;
		for(int i=1;i<=num1&&i<=num2;i++)
		{
			if(num1%i==0&&num2%i==0)
			{
				count=i;
			}
		}
		
		return "The greatest common factor of two number is"+count;
	}

	
	
	// 8 Write a program to print Fibonacci series of n terms where n is input by user :
	//    0 1 1 2 3 5 8 13 21 .....
	public static void  fibonacci(int num)
	{
		int n1 = 0;
		int n2 =1;
		int n3 ;
		for (int i=1;i<=num;i++)
		{
			
			if(i==1)
			{
				System.out.print(n1 + " "+n2);
			}
			else
			{
				n3 = n1+n2;
				System.out.print(" "+n3+" ");
				n1=n2;
				n2=n3;
				
			}
		
		}
		 
	}
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int average = averagesum(a, b, c);
		System.out.println(average);

		int oddPrintSum = sc.nextInt();
		int oddSum = sumOdd(oddPrintSum);
		System.out.println(oddSum + "\n");

		int greater = greater(a, b);
		System.out.println(greater);

		int radius = sc.nextInt();
		circumstanceCircle(radius);

		int user = sc.nextInt();
		String userChoice = userNumber(user);
		System.out.println(userChoice);

		int x = sc.nextInt();
		int y = sc.nextInt();
		powerAnother(x, y);

		String common = greatestCommonDivisor(x,y);
		System.out.println(common);
		
		int num = sc.nextInt();
		fibonacci(num);
		
	}
}
