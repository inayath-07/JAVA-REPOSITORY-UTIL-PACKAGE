//all looping statements in scanner class using all data type
//if all loops are seprately executed they are running properly
import java.util.*;
public class looping_in_scanner_class
{
    public static void main(String args[])
    {
        //creating scanner object 
        try
        (Scanner in = new Scanner(System.in))
       {
        //decleration of short int long
        short a,i=1;

        System.out.println("enter a short number");
        a = in.nextShort();

        //using for loop
        for(i=0;i<=a;i++)
        {
            System.out.println("hello world");
        }

        //using do while loop

        do
        {
            System.out.println("hello");
            i++;
        }while(i<=a);

        //using while loop
        while(i<=a)
        {
            System.out.println("------------");
            i++;
        }

    
        //closing scanner object 
        in.close();
        }
    }     
}