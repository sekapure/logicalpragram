package Stringlogicalprog;

public class Ex7 
{
public static void main(String[] args) 
{
	//find out the ovel of the string
	String s="smita";
	for(int i=0;i<=4;i++)
	{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			System.out.println(s.charAt(i));
		}
	}
		
}
}
