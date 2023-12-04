import java.util.*;
public class Recurssion5 {
	
//FIND THE FIRST AND LAST OCCURANCE OF A GIVEN VARIABLE IN A STRING	
	static int first = -1;
	static int last = -1;
	public static void FirstLast(String s, int count,char element )
	{
		if(s.length()==count)
		{
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char currChar = s.charAt(count);
		if(currChar == element)
		{
			if(first == -1)
			{
				first = count;
			}
			else
			{
				last = count;
			}
		}
		FirstLast(s, count+1, element);
	}
	
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String name = s.next();
	FirstLast(name, 0, 'a');
}
}
