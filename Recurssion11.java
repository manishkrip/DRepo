import java.util.*;
public class Recurssion11 {
	static String keypad[] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"}; 
public static void printCombination(String s, int idx, String comb)
{
	if(idx==s.length())
	{
		System.out.println(comb);
		return;
	}
	char number = s.charAt(idx);
	String mapping = keypad[number- '0'];
	for(int i=0;i<mapping.length();i++)
	{
		printCombination(s, idx+1, comb+mapping.charAt(i));
	}
}
	
public static void main(String[] args) {
	String s = "237";
	printCombination(s, 0, "");
}
}
