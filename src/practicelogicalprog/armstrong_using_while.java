package practicelogicalprog;

public class armstrong_using_while 
{
public static void main(String[] args) 
{
int no=9474;
int temp;
temp=no;
int sum=0;

while(no>0)
{
int rem=no%10;
sum=sum+rem*rem*rem*rem;

no=no/10;
}
if(sum==temp)
{
System.out.println("given no is armstrong");	
}
else
{
System.out.println("given no is not armstrong");
}
}
}
