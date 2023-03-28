//java program on arrays by using Blue J system
//importing packages
import java.util.*;
public class ARRAY_04
{
    //decleration of variable and making it static 
    static Scanner in;
    static int num;
    static int i;
    static int numbers[] = new int[10]; //decleration of variable
    public static void main(String[] args) throws Exception
    {
        in = new Scanner(System.in);
        System.out.println("enter how many numbers are there ");
        num = in.nextInt();
        for(i=1;i<=num;i++)
        {
            System.out.println("enter your numbers");
            numbers[i]=in.nextInt();
            System.out.println("LOADING");         
        }
        for(i=1;i<=num;i++)
        {
            System.out.println(" your numbers are "+numbers[i]);
            Thread.sleep(1000);
        }

    }
}