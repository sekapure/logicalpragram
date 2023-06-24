package arraylogicalprog;

public class Ex6//same /differentindex from given two array
{
public static void main(String[] args)
{
int ar[]= {10,20,58,67,30,40};
int ar1[]= {10,20,56,87,30,40};
for(int i=0;i<=6;i++)
{

	if(ar[i]==ar1[i])//if (ar[i]!=ar1[i]);
	{
		System.out.println(ar[i]+" "+ar1[i]);
	}

}
}
}
