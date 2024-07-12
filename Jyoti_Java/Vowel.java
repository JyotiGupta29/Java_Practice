import java.util.Scanner;
class Vowel
{
	public static void main(String args[])
	{
		
		String v;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an alphabet");
		v=scan.next();
		

		if(v.equals("a") || v.equals("e") || v.equals("i") || v.equals("o") || v.equals("u"))
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
		
	}

}