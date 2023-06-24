package practicelogicalprog;

public class pract1
{
public static void main(String[] args)
{
	
int ar1[][]= {{3,4,5},{5,6,7}};
int ar2[][]= {{1,4,3},{7,8,9}};

int ar3[][]= new int[2][3];
for(int i=0;i<=1;i++)
	{
	for(int j=0;j<=2;j++)
	{
		ar3[i][j]=ar1[i][j]+ar2[i][j];
		System.out.print(ar3[i][j]+" ");
		
	}
System.out.println();

	}

}
}
