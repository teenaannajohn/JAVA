import java.util.*;
public class Product
{
	int pcode;
    String pname;
	int price;
	Product()
	{
		pcode=0;
		pname=null;
		price=0;
	}


public static void find(int a,int b,int c)
{
	int p1=a;
	int p2=b;
	int p3=c;
	float lowest;
	if(p1>p2 && p1>p3)
	{
		lowest=p1;
	}
	else if(p2>p1 && p2>p3)
	{
		lowest=p2;
	}
	else
	{
		lowest=p3;
	}
	System.out.println("The lowest price is: "+lowest);

}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Product p1=new Product();
		Product p2=new Product();
		Product p3= new Product();

		System.out.println("Enter code of product 1");
		p1.pcode=s.nextInt();
		System.out.println("Enter the name of product 1");
		p1.pname=s.next();
		System.out.println("Enter the price of product 1");
		p1.price=s.nextInt();
		System.out.println("Enter code of product 2");
		p2.pcode=s.nextInt();
		System.out.println("Enter the name of product 2");
		p2.pname=s.next();
		System.out.println("Enter the price of product 2");
		p2.price=s.nextInt();
		System.out.println("Enter code of product 3");
		p3.pcode=s.nextInt();
		System.out.println("Enter the name of product 3");
		p3.pname=s.next();
		System.out.println("Enter the price of product 3");
		p3.price=s.nextInt();
		Product.find(p1.price,p2.price,p3.price);


	}
}