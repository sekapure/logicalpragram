package logicalprog;

public class Armstrongno 
{
public static void main(String[] args) 
{
	int n=125,temp,i,sum=0;
	temp=n;
	while(n>0)
	{	                                  //n=125 temp=125 ,125>0 i=125%10=5 sum=0+5*5*5 n=125/10=12
	i=n%10;                               //n=12 temp=12,12>0 i=12%10=2  sum=125+2*2*2=133 n=133/10=1
sum=sum+i*i*i;                           //n=1 temp=1   1>0   i=1%10=1 sum =133+1*1*1=134  n=1/10=0
	n=n/10;                              //n=0 temp=0  0>0
	}	
if(sum==temp)	
	
{
System.out.println("given no is armstrong");	
}
else
{
System.out.println("not armstrong");	
}
}
}

