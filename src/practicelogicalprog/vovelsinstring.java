package practicelogicalprog;

public class vovelsinstring 
{
public static void main(String[] args)
{
String s="rita kale";
for(int i=0;i<=s.length()-1;i++)

if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
{
System.out.println(s.charAt(i));	
}
}
}

