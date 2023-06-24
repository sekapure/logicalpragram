package starlogicalprog;

public class Ex7 
{
public static void main(String[] args)
{
//    *
//   ***
//  *****
//   ***
//    *
int space=5;
int star=1;
for(int i=1;i<=3;i++)
{
for(int j=1;j<=space;j++)
{
System.out.print(" ");
{
for(int k=1;k<=star;k++)
{
System.out.print("* ");	
}
System.out.println(" ");
star=star++;
space=space--;
}
}
}


}
}
