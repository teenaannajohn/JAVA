import java.util.Scanner;
public class Mark_Sum
{
    public static void main(String[] args) 
    {
        int t,p,n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of Subjects:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Marks :");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Total Marks:"+sum);
        p=sum/n;
        System.out.println("Percentage of Marks:"+p+"%");
        }
        }