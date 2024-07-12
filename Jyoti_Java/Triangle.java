import java.util.Scanner;

class Triangle
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first angle of triangle:");
		a=scan.nextInt();
		System.out.println("Enter second angle of triangle:");
		b=scan.nextInt();
		System.out.println("Enter third angle of triangle:");
		c=scan.nextInt();

if (a <= 0 || b <= 0 || c <= 0)
{
System.out.println("InvalidInput");
}
if(a >= (b+c) || c >= (b+a) || b >= (a+c) )
{
System.out.println("Not a Triangle");
}
if(a==b && b==c)
{
System.out.println("Equilateral Triangle");
}
else if (((a * a) + (b * b)) == (c * c) || ((a * a) + (c * c)) == (b * b) || ((c * c) + (b * b)) == (a * a))
{
System.out.println("Right Triangle");
}
else if(a!=b && b!=c && c!=a)
{
System.out.println("Scalene Triangle");
}
else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a))
{
System.out.println("Isosceles Triangle");
}
}   		}
