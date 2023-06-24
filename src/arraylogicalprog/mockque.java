package arraylogicalprog;

public class mockque 
{
	
	public static void main(String[] args) 
	{
	String s="this is my frist interview";
	String ar[]=s.split(" ");//{"this","is","my","frist","interview"};
	System.out.println(ar.length);
	System.out.println(ar[4]);
	
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.print(ar[i]+" ");
		
	}
	
	}
}
