package practicelogicalprog;

public class Armstrongno_4digit
{
	public static void main(String[] args) {
		
	
int no=8208;
int temp;
int sum=0;
for(int i=no;i>0;i=i/10)
{
	int rem=i%10;
	sum=sum+rem*rem*rem*rem;
	
}
if(sum==no)
{
System.out.println("given no is armstrong ");	
}
else
{
System.out.println("given no is not armstrong");
}
}
}
