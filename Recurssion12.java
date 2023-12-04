
//Print all the permutation of a string 
import java.util.*;

public class Recurssion12 {
	public static void printPermu(String s, String per) {
		if (s.length() == 0) {
			System.out.println(per);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
			String news = s.substring(0, i) + s.substring(i + 1);
			printPermu(news, per + curr);
		}
	}

	public static void main(String[] args) {
		String s = "abc";
		printPermu(s, "");
	}
}
