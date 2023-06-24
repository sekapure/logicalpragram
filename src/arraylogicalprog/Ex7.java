package arraylogicalprog;

import java.util.Arrays;

public class Ex7 //find out gretest and smallest num
{
public static void main(String[] args) 
{
int ar[]= {10,20,30,60,50};
Arrays.sort(ar);
//for(int i=0;i<=ar.length-1;i++)
//System.out.println(ar[i]);
System.out.println(ar[ar.length-1]);
System.out.println(ar[0]);
}
}
