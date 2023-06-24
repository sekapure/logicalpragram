package Stringlogicalprog;

public class Ex4 
{
public static void main(String[] args) 
{
String org="smita";
String rev="";
for(int i=4;i>=0;i--)
{
	
rev=rev+org.charAt(i);
}
System.out.println(rev);
}
}
