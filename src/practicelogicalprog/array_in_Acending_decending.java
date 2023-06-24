package practicelogicalprog;

import java.util.Arrays;

public class array_in_Acending_decending
{
public static void main(String[] args) 
{
int ar[]= {6,4,3,2,18,9,3};	

Arrays.sort(ar);
//in acending
for(int i=0;i<=ar.length-1;i++)
{
System.out.println(ar[i]);	
}
System.out.println("==========");
//in decending
for(int j=ar.length-1;j>=0;j--)
{
System.out.println(ar[j]);	
}
}
}
