import java.util.Scanner;
public class Frequency
{
	public static void main(String args[])
	{
		int count=0,i=0,n,num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements you want in the array");
		n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements to the array");
        for(i=0;i<n;i++)
        {
        	a[i]=s.nextInt();
        }
        System.out.println("Enter the element of which you want to count number of occurrences");
        num=s.nextInt();
        for(i=0;i<n;i++)
        {
        	if(a[i]==num)
        	{
        		count++;
        	}
        }
        System.out.println("The no.of ocuurence:"+count);
	}
}