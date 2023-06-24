package Stringlogicalprog;

public class Ex5 
{
public static void main(String[] args)
{
String org ="MADAM"	;
String rev="";
for(int i=4;i>=0;i--)
{
rev=rev+org.charAt(i);
}
System.out.println(rev);

if(org.equals(rev))
{
System.out.println("pelindrome");	
}
else
{
System.out.println("not pelindrome");	
}
}
}