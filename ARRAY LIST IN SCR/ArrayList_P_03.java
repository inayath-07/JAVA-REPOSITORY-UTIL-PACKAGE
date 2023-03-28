/*using IO operation to insert value in ArrayList */
//importing packages
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_P_03 
{
    public static void main(String[] args)throws Exception
    {
        //creatiing SCR object
        Scanner in = new Scanner(System.in);
        //creating  array list
        ArrayList<String> al = new ArrayList<>();

        System.out.println("enter how many names are there");
        int num = in.nextInt();
        System.out.println("-----");

        //assing values to ArrayList
        for(int i=0;i<=num;i++)
        {
         System.out.println("enter "+i+" name");
         al.add(in.nextLine());
        }

        //displaying index number as 
        System.out.println("-------");
        for(int i=0;i<=num;i++)
        {
            System.out.println("your input was "+al.get(i)+"and index number is "+al.indexOf(al.get(i)));
        }

        //all closing statements
        in.close();
    }
}
