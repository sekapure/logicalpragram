package arraylogicalprog;

import java.util.HashSet;

public class duplicate_from_string
{
public static void main(String[] args)
{
	String s1="abcdefabcdef";
	char ar[]=s1.toCharArray();
HashSet<Character> hs=new HashSet<>();
for(int i=0;i<=s1.length()-1;i++)
{
hs.add(ar[i]);

}
for(Object o:hs)
{
System.out.println(o);	
}


}
}
