package Stringlogicalprog;

public class Ex2 
{
public static void main(String[] args)
{
String s="my name is abc";
String []ar=s.split(" ");//{"my","name","is","abc"};
System.out.println(ar.length);
for(int i=0;i<=ar.length-1;i++)
{
System.out.println(ar[i]);	
}
}
}
