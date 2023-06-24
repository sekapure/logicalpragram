package practicelogicalprog;

public class prac 
{
public static void main(String[] args)
{
int orgno=4567;
int revno=0;
for(int i=orgno;i>0;i=i/10)
{
int rem=i%10;
revno=revno*10+rem;
}
System.out.println(revno);
}
}
