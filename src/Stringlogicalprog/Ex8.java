package Stringlogicalprog;

import java.util.HashSet;

public class Ex8
{
public static void main(String[] args)
{
String s1="abcdefabcdef";
char ch[]=s1.toCharArray();
HashSet<Character> hs=new HashSet();
for(int i=0;i<=s1.length()-1;i++)
{
	hs.add(ch[i]);
	
}
System.out.println();
}
}
