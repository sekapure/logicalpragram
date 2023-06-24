package practicelogicalprog;

public class Two_dimentionalarry_addition 
{
public static void main(String[] args) 
{
//7 8     //5 6 
//4 6     //3 4
	int ar1[][]= {{7,8},{4,6}};
	int ar2[][]= {{5,6},{3,4}};
int ar3[][]=new int[2][2];	

for(int i=0;i<=1;i++)
{
for	(int j=0;j<=1;j++)
{
 ar3[i][j]=ar1[i][j]+ar2[i][j];	

System.out.print(ar3[i][j]+"  ");
}
System.out.println();
}
}
}
