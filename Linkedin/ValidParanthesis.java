package Linkedin;
import java.util.*;

import javax.swing.Popup;
public class ValidParanthesis {
public boolean paranthesis(String str)
{
	Stack<Character> s = new Stack<Character>();
	for(int i=0;i<str.length();i++)
	{
		char curr = str.charAt(i);
		if(isOpening(curr))
		{
			s.push(curr);
			
		}
		else
		{
			if(s.isEmpty())
			{
				return false;
			}
			else if(!isMatching(s.peek(), curr))
			{
				return false;
			}
			else {
				s.pop();
			}
		}
	}
	return s.isEmpty();
}
	
public boolean isOpening(char c) {
    return c == '(' || c == '{' || c == '[';
}
public boolean isMatching(char a, char b)
{
	return (a=='{' && b==  '}')|| (a=='[' && b==  ']')|| (a=='(' && b==  ')');
}
	public static void main(String[] args) {
		ValidParanthesis v = new ValidParanthesis();
		System.out.println(v.paranthesis("({})"));
		
	}
}
