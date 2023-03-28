//program using constant
//to find circumferance of a circle
import java.util.*;
public class constant_circumferance
{
    public static void main(String args[])
    {
        //creating scanner object 
        Scanner in = new Scanner(System.in);

        //decleration of constatnt 
        final double pie = 3.142857143;

        //decleration of variable 
        int radius;
        System.out.print("enter radius of circle :");
        radius = in.nextInt();

        System.out.println(2*pie*radius);

        //closing scanner object 
        in.close();

    }    
}
