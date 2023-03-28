/*this program will use ArrayList in other class then it will take 
* input names 
* and return it reverse way
*/

/*Note that you cannot use . operator in alone class 
 * but it should be under any function to work
*/

//importing packages
import java.util.ArrayList;
import java.util.Scanner;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ArrayList_P_06
{
    //decleration of variabels
    static int num;
    public static void main(String[] args) throws Exception
    {
        //creatin SCR object
        Scanner in = new Scanner(System.in);

        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader ISR = new BufferedReader(read);

        System.out.println("enter numbers of names");
        num = in.nextInt();

        //creating ArrayList
        ArrayList<String> names = new ArrayList<>();

        System.out.println("size of your Arraylist before assingin values ");
        System.out.println("is "+names.size());

        System.out.println("----------------------------");

        //assning names to ArrayList
        System.out.println("enter names");
        for(int i =1;i<=num;i++)
        {
            System.out.print(i+".");
            names.add(ISR.readLine());

            Thread.sleep(100);
        }

        System.out.println("size of your Arraylist after assingin values ");
        System.out.println("is "+names.size());

        System.out.println("------------playing reverse ----------");

        //displaying names in revese way
        for(int i = num-1;i>=0;i--)
        {
            System.out.print((i+1)+".");
            System.out.println(names.get(i));

            Thread.sleep(1000);
        }

        //all closing statements
        in.close();
    }
}