package Stringlogicalprog;

public class Ex3 
{
public static void main(String[] args) 
{
String s1="v e l o c i t y";//find out length without using length()
String ar[]=s1.split(" ");//{"v","e","l","o","c","i","t","y"};
System.out.println(ar.length);
for(int i=0;i<=ar.length-1;i++)
{
System.out.println(ar[i]);
}
}
}
