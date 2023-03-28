/* W.A.P. to accept number and print them if number = 0 terminate the program*/
import java.util.*;
public class logic_P_01 
{
    public static void main(String args[]) 
    {
        //creating scanner object 
        Scanner in = new Scanner(System.in);
        
        //decleration of variable
        int num; //exnumber = experiment number 
        System.out.println("enter number if you want to get out press 0");
        num = in.nextInt();

        while(num!=0)
        {

            if(num>0)
            {
            System.out.println("enter number :");
            num = in.nextInt();

            System.out.println(num);
            }
            else if(num==0)
            {
                break;
            }
            
        }
        //creating scanner object 
        in.close();
    }    
}
