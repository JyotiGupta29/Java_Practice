import java.util.*;
public class Third
{
	public static void main(String args[])
	{   
		int num,no,n1,n2,n3,res;
    	System.out.println("Enter a number");
    	 Scanner s = new Scanner(System.in);
 
        // Read the next integer from the screen
        num = s.nextInt();
 
        
        System.out.println("Entered integer is: "
                           + num);
        n1=num%10;
        no=num/10;
        n2=no%10;
        no=no/10;
        n3=no%10;

        res=n1+n2+n3;
        System.out.println("Addition of a digits of an entered number is: "
                           + res);
}
}