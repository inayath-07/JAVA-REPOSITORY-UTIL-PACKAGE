//in this program conditional statements is used 
import java.util.*;
public class conditional_using_scanner_class 
{
    public static void main(String args[])
    {
        //creating scanner object 
        Scanner in = new Scanner(System.in);

        //decleration of variable 
        int age;
        System.out.print("enter your age :");
        age = in.nextInt();

        //checking category of your age using if and if else statements
        if(age>=1 && age<=12)
        {
            System.out.println("you are a kid");
        }
        if(age>=13 && age<=19)
        {
            System.out.println("you are a teen ");
        }
        if(age>=20 && age<=35)
        {
            System.out.println("you sre a youth ");
        }
        if(age>=36 && age<=45)
        {
            System.out.println("still you are a youg person");
        }
        if(age>=46 && age<=50)
        {
            System.out.println("you entered first stage of old age ");
        }
        if(age>=51)
        {
            System.out.println("a you old person");
        }
        else
        {
            System.out.println("please enter valid age ");
        }

        //time to use switch statements 
        String name;
        
        System.out.println("enter your name :");
        name = in.nextLine();

        switch (name)
        {
            case " hello":
            System.out.println("hello how are you ");
            break;

            case "hi":
            System.out.println("nice to meet you bye");
            break;
            
            case "assalamualaikum" :
            System.out.println("walaikum asalam");
            break;

            default:
            System.out.println("unable to answer");

        }

        //switch case usig char data type
        char character;
        System.out.println("enter any character ");
        character = in.next().charAt(0);

        switch (character)
        {
            case 'a':
            System.out.println("a for apple");
            break;

            case 'b':
            System.out.println("b for ball");
            break;

            default:
            System.out.println("invalid character");
        }


        //closing scanner object
        in.close();
    }    
}
