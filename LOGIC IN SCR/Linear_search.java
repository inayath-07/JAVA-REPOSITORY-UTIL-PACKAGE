/*this program to use to search the character from a list of character */
//importing packages
import java.util.Scanner;

public class Linear_search
{
    public static void main(String args[])
    {
        //decleration of Variable int size;
        int size;
        char store_it[]= new char[20];

        //creating SCR object
        Scanner in = new Scanner(System.in);

        System.out.println("enter array size");
        size = in.nextInt();

        System.out.println("enter element to be searched");
        char search = in.next().charAt(0);

        System.out.println("enterd "+size+" character ");

        for(int i =0;i<size;i++)
        {
            System.out.print((i+1)+".");
            store_it[i] = in.next().charAt(0);
        }
        //linear search pocess
        for(int i =0;i<size;i++)
        {
            if(store_it[i] == search)
            {
                System.out.println("yes your character is there");
                System.exit(0);
            }
        }
        System.out.println("no your character is not there ");
        //all closing statement
        in.close();
    }
}