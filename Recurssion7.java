//Move a given variable to the end of the given string 

import java.util.*;
public class Recurssion7 {
	public static void Shift(String s, int indx, int count, String news)
	{
		if(indx == s.length())
		{
			for(int i=0;i<count;i++)
			{
				news+= 'x';
				
			}
			System.out.print(news);
			return;
		}
		char currchar = s.charAt(indx);
		if(currchar == 'x')
		{
			count++;
			Shift(s, indx+1, count, news);
		}
		else
		{
			news+= currchar;
			Shift(s, indx+1, count, news);
		}
	}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String s= sc.next();
	Shift(s, 0, 0, "");
}
}
