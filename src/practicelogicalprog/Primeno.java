package practicelogicalprog;

public class Primeno
{
public static void main(String[] args)
{
int no=6;
int count=0;

for(int i=1;i<=7;i++)
{
if(no%i==0)
{
count++;

}
}
if(count==2)
{
System.out.println("prime no");	
}
else
{
System.out.println("not prime");	
}
}
	
}

