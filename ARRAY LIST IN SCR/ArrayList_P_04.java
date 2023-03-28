/*It perform basics operation like 
 * addAll() -->this () used to add all elements of 1 arraylist to other
 * removeAll() -->use to remove all elemnts add by addAll () from particular
 * retainAll() -->it is opposite of removeAll()
 * -------------------------------
 * NOTE :you can use only one () at a time ethier removeall or retainall()
 * you can reffer everything from a video present in JAVA A COMPLETE GROUP 
*/
//importing packages
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_P_04
{
    public static void main(String[] args) throws Exception
    {
        //creating SCR object
        Scanner in = new Scanner(System.in);

        //creating arraylist for addAll operation 
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Size of your arraylist is "+al.size());

        System.out.println("----------------------");

        System.out.println("enter your 10 names");
        for(int i =1;i<=10;i++)
        {
            System.out.print(i+".");
            al.add(in.nextLine());
        }

        System.out.println("-----------ArrayList2-----------");

        ArrayList<String> al1 = new ArrayList<>();

        for(int i=1;i<=10;i++)
        {
            System.out.print(i+".");
            al1.add(in.nextLine());
        }
        //using addAll

        System.out.println("-----using addAll()-----");

        al1.addAll(al);

        for(int i=0;i<=al1.size()-1;i++)
        {
         System.out.print(i+1+".");
         System.out.println(al1.get(i));
         Thread.sleep(1000);
        }     

        //using removeAll()
        System.out.println("----removeAll()");
        al1.removeAll(al);

        //printing removeall
        for(int i =0;i<=al1.size()-1;i++)
        {
            System.out.print(i+1+".");
            System.out.println(al1.get(i));

            Thread.sleep(1000);
        }

        //using retainAll()
        al1.retainAll(al);
        for(int i=0;i<=al1.size()-1;i++)
        {
            System.out.print(i+1+".");
            System.out.println(al.get(i));
        }
        //all closing statemens
        in.close();

    }
    
}
