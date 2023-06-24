package practicelogicalprog;

public class duplicate_no_inarray
{
public static void main(String[] args)
{
int ar[]= {1,2,4,2,2,2,8,9,7};	

for(int i=0;i<=ar.length-1;i++)
{
	
for(int j=i+1;j<=ar.length-1;j++)
{
	
if(ar[i]==ar[j])
System.out.println(ar[i]);
}
}
}
}
