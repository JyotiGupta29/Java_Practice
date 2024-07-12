import java.util.Scanner;
class FirstPrg
{
	public static void main(String args[])
	{
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=scan.nextInt();

		if(num<20)
		{
			System.out.println("Number is less than 20");
		}
		else
		{
			System.out.println("Please enter number less than 20");
	
		}
	}
}