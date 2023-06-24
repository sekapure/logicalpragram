package starlogicalprog;

public class Ex9
{
public static void main(String[] args)
{
//A
//BB
//CCC
//DDDD
	
	char letter='A';
	
	for(char i='A';i<='D';i++)
	{
		for(char j='A';j<=letter;j++)
		{
			System.out.print(i);
		}
		
		System.out.println();
		letter++;
		
	}
}
}
