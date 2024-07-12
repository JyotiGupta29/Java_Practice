import java.util.Scanner;

class SecondPrg
{
		
	public static void main(String args[])
	{
		int age;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age:");
		age=scan.nextInt();

		if(age>=18)
		{
			System.out.println("You are eligible for voting");
		}
		else
		{
			System.out.println("You are not eligible for voting");
	
		}
	}	
}