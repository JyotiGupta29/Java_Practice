import java.util.*;
class Even
{
	public static void main(String args[])
	{
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		a=s.nextInt();
		if((a&1)==1)
		{
			System.out.println("Odd");
		}
		else if((a&1)==0)
		{
			System.out.println("Even");
		}
		System.out.println(a^1);
	}
}