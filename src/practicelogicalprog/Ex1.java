package practicelogicalprog;

public class Ex1 
{
public static void main(String[] args) 
{
int num=1234	;
int revnum =0;
for(int i=num;i>0;i=i/10)
{
int rem=i%10;

revnum=10*revnum+rem;
}
System.out.println(revnum);
}
}
