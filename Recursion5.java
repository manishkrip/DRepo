import java.util.*;
public class Recursion5 {
	
	public static void ReverseString(String s , int size)
	{
		if(size==0)
		{
			System.out.print(s.charAt(size));
			return;
		}
		
		System.out.print(s.charAt(size));
		ReverseString(s,size-1);
	}
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	String name = s.next();
	ReverseString(name , name.length()-1);
}
}
