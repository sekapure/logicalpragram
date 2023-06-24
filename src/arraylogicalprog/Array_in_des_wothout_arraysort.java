package arraylogicalprog;

public class Array_in_des_wothout_arraysort
{
public static void main(String[] args)
{
int ar[]= {5,7,2,4,9,10};
for(int i=0;i<=ar.length-1;i++)
{
for(int j=i+1;j<=ar.length-1;j++)	
{
int temp;
if(ar[i]<ar[j])
{
temp=ar[i];
ar[i]=ar[j];
ar[j]=temp;

}
}
System.out.println(ar[i]);
}
}

}

