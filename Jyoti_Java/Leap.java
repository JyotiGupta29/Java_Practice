import java.util.Scanner;
class Leap
{
	public static void main(String args[])
	{
		
		int year;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Year:");
		year=scan.nextInt();
		

		if(year%100!=0)
		{
			if(year%4==0)
			{
                System.out.println("is leap Year");

			}
			else
			{
				System.out.println("not a leap Year");

			}
		}
		else
		{
			if(year%400==0 && year!=0)
			{
                System.out.println("It is a century leap Year");

			}
			else
			{
				System.out.println("not a leap Year");

			}
		}
	}
}