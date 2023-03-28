//P to accept string value and store it into in array
//importing packages 
import java.io.*;
import java.util.*;

public class ARRAY_05
{
    //decleration of variable
    static Scanner SC;
    static int i;   
    static int num;
    public static void main(String[] args)throws IOException
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        //creating Scanner object 
        SC =new Scanner(System.in);

        System.out.println("enter how many name are to enter");             
        num = SC.nextInt();

        System.out.println("which name contain maximum number of alphabet enter that name ");
        String max_name = in.readLine();
        
        int max_name_num = max_name.length();
        String name[] = new String[max_name_num];

        for(i=1;i<=num;i++)
        {
            System.out.println("enter your names ");            
            name[i] = SC.nextLine();

        }
        for(i=1;i<=num;i++)
        {
            System.out.println(name[0]);
        }


          
    }
}