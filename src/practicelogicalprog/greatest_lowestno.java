package practicelogicalprog;

import java.lang.reflect.Array;
import java.util.Arrays;

public class greatest_lowestno
{
public static void main(String[] args) 
{
int ar[]= {30,80,90,60,40};
Arrays.sort(ar);
for(int i=0;i<=ar.length-1;i++)
{
System.out.println(ar[i]);	
}
System.out.println("------------");
//greatest no
System.out.println(ar[ar.length-1]);

//lowest no
System.out.println(ar[0]);
}
}
