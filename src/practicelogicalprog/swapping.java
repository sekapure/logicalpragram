package practicelogicalprog;

public class swapping 
{
public static void main(String[] args) 
{
int num1=10;
int num2=20;
System.out.println("before swapping"+num1);
System.out.println("before swapping"+num2);

num1=num1+num2;//30
num2=num1-num2;//10
num1=num1-num2;
System.out.println("after swapping"+num1);
System.out.println(num2);

}
}
