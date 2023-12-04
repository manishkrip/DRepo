import java.util.*;
//print subsequeence of a string

public class Recurssion9 {
	public static void Subseq(String s ,int idx, String news)
	{
		if(idx==s.length())
		{
			System.out.println(news);
			return;
		}
		char currc = s.charAt(idx);
		//to be 
		Subseq(s,idx+1,news+currc);
		
		//not to be
		Subseq(s,idx+1,news);
		
	}
public static void main(String[] args) {
	String m= "123";
	Subseq(m,0,"");
}
}
