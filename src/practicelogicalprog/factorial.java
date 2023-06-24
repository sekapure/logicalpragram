package practicelogicalprog;

public class factorial
{
	public static void main(String[] args) {
		
	
	int no=5;//4*3*2*1     //5*4*3*2*1
	int fact=1;//4//12//24//24
	for(int i=no;i>=1;i--)
		
	{
		fact=fact*i;
	}
	System.out.println(fact);

}
}