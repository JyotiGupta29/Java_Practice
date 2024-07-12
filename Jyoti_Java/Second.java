import java.util.*;
public class Second
{
	public static void main(String args[])
	{   
		int num,n1,n2,res;
    	System.out.println("Enter a number");
    	 Scanner s = new Scanner(System.in);
 
        // Read the next integer from the screen
        num = s.nextInt();
 
        
        System.out.println("Entered integer is: "
                           + num);
        n1=num%10;
        n2=num/10;
        res=n1+n2;
        System.out.println("Addition of a digits of an entered number is: "
                           + res);
}
}
