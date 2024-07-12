import java.util.Scanner;

class FifthPrg
{
	public static void main(String args[])
	{
		int ang1,ang2,ang3;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first angle of triangle:");
		ang1=scan.nextInt();
		System.out.println("Enter second angle of triangle:");
		ang2=scan.nextInt();
		System.out.println("Enter third angle of triangle:");
		ang3=scan.nextInt();

		if((ang1+ang2+ang3)==180)
		{
			System.out.println("It is a Triangle");
		}
		else
		{
			System.out.println("It is not a Triangle");
	
		}
}
}