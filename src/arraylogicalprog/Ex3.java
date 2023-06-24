package arraylogicalprog;

public class Ex3 //duplicate num
{
public static void main(String[] args) 
{
int ar[]= {10,20,10,30,10,40,50};
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
