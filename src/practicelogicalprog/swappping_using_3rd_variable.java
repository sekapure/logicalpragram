package practicelogicalprog;

public class swappping_using_3rd_variable
{
public static void main(String[] args) 
{
int num1=10;
int num2=20;
int temp;
System.out.println("before swapping:"+num1);
System.out.println(num2);

temp=num1;//10

num1=num2;//20
num2=num1-temp;

System.out.println("after swapping :"+num1);
System.out.println(num2);
}
}
