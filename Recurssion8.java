//Remove the duplicate element in the word
import java.util.*;
public class Recurssion8 {
	public static boolean map[] = new boolean[26];
	
	public static void RemoveDuplicate(String s, int idx , String news)
	{
		if(idx == s.length())
		{
			System.out.print(news);
			return;
		}
		char curr = s.charAt(idx);
		if(map[curr - 'a'] == true)
		{
			RemoveDuplicate(s, idx+1, news);
		}
		else
		{
			news += curr;
			map[curr - 'a'] = true;
			RemoveDuplicate(s, idx+1, news);
		}
	}
	
public static void main(String[] args) {
	String s = "ababbdbabjdjifnind";
		RemoveDuplicate(s, 0, "");	
}
}
