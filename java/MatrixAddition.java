import java.util.Scanner;
class MatrixAddition
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int p,q,i=0,j=0,k=0,x,y;
		System.out.println("Enter the no.of rows of 1st matrix");
		p=s.nextInt();
		System.out.println("Enter the no.of columns of 1st matrix");
		q=s.nextInt();
		int a[][]=new int[p][q];
		System.out.println("Enter the 1st matrix");
        for(i=0;i<p;i++)
        {
        	for(j=0;j<q;j++)
        	{
        		a[i][j]=s.nextInt();
        	}
        }
        System.out.println("Enter the no.of rows of 2nd matrix");
        x=s.nextInt();
        System.out.println("Enter the no.of columns of 2nd matrix");
        y=s.nextInt();
        int b[][]=new int[x][y];
        System.out.println("Enter the second matrix");
        for(i=0;i<x;i++)
        {
        	for(j=0;j<y;j++)
        	{
        		b[i][j]=s.nextInt();
        	}
        }
        
        int c[][]=new int[x][y];
        for(i=0;i<p;i++)
        {
        	for(j=0;j<y;j++)
        	{
        		for(k=0;k<q;k++)
        		{
        			c[i][j]=a[i][j]+b[i][j];

        		}
        	}
        }
        System.out.println("sum of matrix:");
        for(i=0;i<p;i++){
        	for(j=0;j<y;j++)
        	{
        		System.out.println(c[i][j]);
        	}
        }
        
	}
}