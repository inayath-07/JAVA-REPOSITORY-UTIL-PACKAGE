//importing packages
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList_P_05 
{
    public static void main(String[] args) 
    {
        //creatin SCR object
        Scanner in = new Scanner(System.in);
        //creating arraylist
        ArrayList<String> car = new ArrayList<>();
        car.add(0,"BMW");        
        car.add(1,"audi");
        car.add(2,"mercadies");

        System.out.println("enter random numbers between 0 & 3");
        int i = in.nextInt();

        if(i>=0 && i<3)
        {
         System.out.println(car.get(i));
        }
        else
        {
            System.out.println("please enter correct number");
        }

        //all closing statements
        in.close();
    }    
}
