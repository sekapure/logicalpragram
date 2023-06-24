package arraylogicalprog;

public class Ex4 //duplicate char from string 
{
public static void main(String[] args) 
{
String s="MADAM";
char ar[]=s.toCharArray();//M A D A M
{
	for(int i=0;i<=ar.length-1;i++)
	{
	 for(int j=i+1;j<=ar.length-1;j++)
		 
		 if(ar[i]==ar[j])
		 {
			 System.out.println(ar[i]);
		 }
		
	}
}
}
}
