package arraylogicalprog;

public class Ex12
{
public static void main(String[] args) 
{
int orgnum=1234;
int revnum=0;//4

for(int i=orgnum;i>0;i=i/10)
{
	//rem=i%10;
	int rem=i%10;
	//System.out.println(rem);
	
	
revnum=revnum*10+rem;
}
System.out.println(revnum);

}
}
