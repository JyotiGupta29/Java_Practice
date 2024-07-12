 import java.util.Scanner;
class Marks
{
	public static void main(String args[])
	{
		int marks1,marks2,marks3,marks4,marks5,total;
		String g;
		System.out.println("Enter marks for first subject:");
        Scanner s = new Scanner(System.in);
 
        
        marks1= s.nextInt();
		System.out.println("Enter marks for second subject:");
		 marks2= s.nextInt();
		System.out.println("Enter marks for third subject:");
		 marks3= s.nextInt();
		System.out.println("Enter marks for fourth subject:");
		 marks4= s.nextInt();
		System.out.println("Enter marks for fifth subject:");
		 marks5= s.nextInt();
		System.out.println("Enter your gender for male 'm' or for female 'f':");
		g=s.next();
		double percentage;
		total=marks1+marks2+marks3+marks4+marks5;
		percentage=(total*100)/500;
		
		System.out.println("Percentage:"+percentage+"%");
		if(percentage>=60 && g.equals("m"))
		{
		System.out.println("You are eligible for admission.");
		}		
		
		else if(percentage>=80 && g.equals("f"))
		{
		System.out.println("You are eligible for admission.");

		}
		else
		{
		System.out.println("You are not eligible for admission.");

		}
	}

}
