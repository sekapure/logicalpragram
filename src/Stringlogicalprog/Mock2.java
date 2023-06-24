package Stringlogicalprog;

public class Mock2 
{
public static void main(String[] args)//count uppercase and lower case letter in given string
{
String s="Eseence";
int upper=0,lower=0;
//char e;
for(int i=0;i<=s.length()-1;i++)
	
{
char ch=s.charAt(i);
if(ch>='A' && ch<='Z')
	upper++;

 if(ch=='e')
	
	lower++;

}
System.out.println("upper case letter"+upper);

System.out.println("no oflower case e  letter"+lower);
}
	

}

