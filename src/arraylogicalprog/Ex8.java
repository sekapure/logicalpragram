package arraylogicalprog;

import java.util.Arrays;

public class Ex8 //acending and decending order
{
public static void main(String[] args)
{
int ar[]= {7,4,2,1,3};
Arrays.sort(ar);
for(int i=0;i<=ar.length-1;i++)
{
System.out.println(ar[i]);	
}
System.out.println("----------");
for(int j=ar.length-1;j>=0;j--)
{
System.out.println(ar[j]);	
}
}
}
