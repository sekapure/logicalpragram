package Stringlogicalprog;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class convert_given_string_in_sequence_of_char 
{
	public static void main(String[] args) {
		
	
String s="smita ekapure";
char ch[]=s.toCharArray();
TreeSet<Character> ts=new TreeSet<Character>();


for(int i=0;i<=s.length()-1;i++)
{
	
ts.add(ch[i]);

}
	System.out.println(ts);
}
}