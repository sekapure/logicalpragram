package arraylogicalprog;

public class Ex1//int array asending order without sort array
{
public static void main(String[] args) 
{
int ar[]= {20,30,5,5,40,56};//{20,5,
for(int i=0;i<=ar.length-1;i++)//20    30   5  5    40
{
	for(int j=i+1;j<=ar.length-1;j++)//30   5  40     
	{
		int temp;
		
		if(ar[i]>ar[j])	//no    yes     no
		{
		
	temp=ar[i];//   30
	ar[i]=ar[j];//    5
	ar[j]=temp;//     30
		
	
		
}
}
System.out.println(ar[i]);//  20 5 
}

}
}

