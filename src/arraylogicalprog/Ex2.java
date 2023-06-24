package arraylogicalprog;

public class Ex2 //array decending with sort array
{
public static void main(String[] args) 
{
int ar[]= {9,8,4,5,7,2,5,3};
for(int i=0;i<=ar.length-1;i++)
{
for(int j=i+1;j<=ar.length-1;j++)
{
	if(ar[i]<ar[j])
	{
	int temp;
	temp=ar[i];
	ar[i]=ar[j];
	ar[j]=temp;
	
}
}
System.out.println(ar[i]);



}
}
}
