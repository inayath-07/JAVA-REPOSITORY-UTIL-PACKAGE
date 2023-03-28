// here by default try is used 
//program to display your name 
import java.util.*;
public class string_input 
{
    public static void main(String args[])
    {
        // creating scanner object
        try 
        (Scanner in = new Scanner(System.in))
        {
            //decleration of string variable 
            String name;
            int i,number;
            System.out.println("enter your name below");
            name = in.nextLine();

            System.out.print("enter how many time you want to print your name :");
            number = in.nextInt();

            for(i=0;i<=number;i++)
            {
                System.out.println(name);
            }

            //closing scanner object 
            in.close();
        }
    }
}