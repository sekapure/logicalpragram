package practicelogicalprog;

public class find_uppercase_lowercase_letter_in_string
{
public static void main(String[] args) 
{
String s="Smita Ekapure";
int upper=0;int lower=0;
for(int i=0;i<=s.length()-1;i++)
{
	char ch=s.charAt(i);
	
if(ch>='A' && ch<='Z')

  upper++;

if(ch>='a'&& ch<='z')
	

  lower++;	

}
	
System.out.println("upper case letter"+upper);	
System.out.println("lower case letter"+lower);	


}
}
