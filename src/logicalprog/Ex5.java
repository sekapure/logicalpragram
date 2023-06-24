package logicalprog;

public class Ex5
{
public static void main(String[] args)
{
int num=6;
int count=0;

	for(int i=1;i<=7;i++)
	{
		if(num%i==0)
		{
		count++;
		}
	}
		if(count==2)
		{
			
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
	}
}

