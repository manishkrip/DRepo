import java.util.HashSet;
//Print unique subsequence 
public class Recurssion10 {
	public static void Subseq(String s ,int idx, String news,HashSet<String> set)
	{
		if(idx==s.length())
		{
			if(set.contains(news))
			{
			return;
			}
			else
			{
				System.out.println(news);
				set.add(news);
				return;
			}
		}
		char currc = s.charAt(idx);
		//to be 
		Subseq(s,idx+1,news+currc,set);
		
		//not to be
		Subseq(s,idx+1,news,set);
		
	}
public static void main(String[] args) {
	String m= "aaa";
	HashSet<String> set = new HashSet<>();
	Subseq(m,0,"",set);
}
}
