package Linkedin;

public class ValidPallindrom {
	public static boolean validPallindrom(String s)
	{
		
		StringBuilder check = new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i))|| Character.isLetter(s.charAt(i)))
			{
				check.append(s.charAt(i));
			}
				
		}
		int n = check.length()-1;
		for(int i=0;i<(check.length()/2);i++)
		{
	        if(check.charAt(i)== check.charAt(n-i))
	        {
	        	return true;
	        }
		}
		return false;
	}
public static void main(String[] args) {
	System.out.println(validPallindrom(" aba "));
}
}
