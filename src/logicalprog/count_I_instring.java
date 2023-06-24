package logicalprog;

public class count_I_instring 
{
public static void main(String[] args) 
{
String s="pepsi";
int count=0;
for(int i=0;i<=s.length()-1;i++)
{
	
if(s.charAt(i)=='p')

{
count++;

}
}
System.out.println("no of occurance of p in string "+count);
}

}


