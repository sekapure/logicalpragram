package logicalprog;

public class Armstrongusing2 
{
public static void main(String[] args)
{
	int no=125;
	int temp;
	temp=no;
	int sum=0;
	for(int i=no;i>0;i=i/10)    // i=153 153>0  153%10 =3  sum=27
	{
	                             //i=27 27>0 27%10=7   sum27+7*7*7
		
		                         //
		int rem=i%10;
		 sum=rem*rem*rem+sum;
		
	}
	if(sum==no)
	{
		
		System.out.println("armstrong no");
	}
	else
	{
		
		System.out.println("not armstrong");
	}
}
}
