package arraylogicalprog;

public class Ex10 //addition of two matrix
{
public static void main(String[] args) 
{
	//10 20 30   //2 1 3
	//40 50 60   //5 6 7
	
int ar1[][]= { {10,20,30},{40,50,60}};
int ar2[][]= {{2,1,3},{5,6,7}};
int ar[][]=new int[2][3];
for(int i=0;i<=1;i++)
{
for(int j=0;j<=2;j++)
{
	

ar[i][j]=ar1[i][j]+ar2[i][j];

System.out.print(ar[i][j]+" ");	
}
System.out.println();

}
}
}
