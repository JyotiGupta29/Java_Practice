import java.util.Scanner;
class Number
{
	public static void main(String args[])
	{
		int n1,n2,n3;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a 1st number:");
		n1=scan.nextInt();
		System.out.println("Enter a 2nd number:");
		n2=scan.nextInt();
		System.out.println("Enter a 3rd number:");
		n3=scan.nextInt();

		if(n1>n2 && n1>n3  )
		{
		System.out.println("Number 1 is largest");

		}
		else if (n2>n1 && n2>n3)
		{
		System.out.println("Number 2 is largest");
			
		}
		else
		{
		System.out.println("Number 3 is largest");

		}
		
	}
}