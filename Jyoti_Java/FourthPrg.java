import java.util.Scanner;

class FourthPrg
{
		
	public static void main(String args[])
	{
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=scan.nextInt();

		if(num%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
	
		}
	}	
}