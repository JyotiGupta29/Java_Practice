import java.util.Scanner;
class Character
{


	public static void main(String args[])
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Character:");
		char c=scan.next().charAt(0);

		if((int)c>= 65 && (int)c<=95)
		{
			System.out.println("Character entered is uppercase alphabet");
		}
		else if((int)c >=97 && (int)c<=122)
		{
			System.out.println("Character entered is lowercase alphabet");
	
		}
		else if ((int)c >=48 && (int)c<=57) {
			System.out.println("Character entered is digit");
		}
		else
		{
			System.out.println("Character entered is a special character");
		}

	}
}