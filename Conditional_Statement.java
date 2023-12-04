import java.util.*;
public class Conditional_Statement {
	public static void main(String args[])
	{
		// WE ARE WRITING A PROGRAM FOR CHECKING THE NUMBER IS ODD OR EVEN
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number % 2 == 0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
		
		// NOW WE ARE IMPLEMENTING SWITCH PROGRAM
		
		int button = sc.nextInt();
		switch(button) {
		case 1:
			System.out.println("Hello");
			break;
		case 2:
			System.out.println("Namaste");
			break;
		case 3:
			System.out.println("Bonjore");
			break;
		default:
			System.out.println("You have press the wrong key");
			break;
		}
			
	}
}
