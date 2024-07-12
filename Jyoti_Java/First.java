
import java.util.*;
public class First
{
	public static void main(String args[])
	{   
		int num,no;
    	System.out.println("Enter a number");
    	 Scanner s = new Scanner(System.in);
 
        // Read the next integer from the screen
        num = s.nextInt();
 
        
        System.out.println("Entered integer is: "
                           + num);
        no=num%10;
        System.out.println("Last digit of an entered number is: "
                           + no);

	}
}