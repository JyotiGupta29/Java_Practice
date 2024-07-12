import java.util.*;
public class Fourth
{
    public static void main(String args[])
    {   
        int num,no,n1,n2,n3,n4,res;
        System.out.println("Enter a number");
                System.out.println("Total Marks:"+total);

        
        System.out.println("Entered integer is: "
                           + num);
        n1=num%10;
        no=num/10;
        n2=no%10;
        no=no/10;
        n3=no%10;
        no=no/10;
        n4=no%10;

        res=n1+n2+n3+n4;
        System.out.println("Addition of a digits of an entered number is: "
                           + res);
}
}