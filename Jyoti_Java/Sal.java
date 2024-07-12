import java.util.Scanner;
class Sal
{
	public static void main(String args[])
	{
		double bs,da,ta,hr,gs;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter basic salary:");
		bs=scan.nextDouble();
		System.out.println("Enter a daily allowance");
		da=scan.nextDouble();
		System.out.println("Enter travel allowance:");
		ta=scan.nextDouble();
		System.out.println("Enter house rent:");
		hr=scan.nextDouble();
		gs=bs+da+ta+hr;
		System.out.println("Gross Salary is: "+gs);

    }
}