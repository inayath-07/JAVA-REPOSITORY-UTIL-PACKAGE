/*for the better rivision reffer the following video
* this program also uses this.
* https://youtu.be/d08oJlwVgyo
*/

//importing packages
import java.util.Scanner;

//creating class for eg student
class student
{
   String name;
   int pin;

   //creating constructor
   public student(String name, int spin)
   {
        this.name = name;
        pin = spin;
   }

   //using toString () 
   public String toString()
   {
        return name + " " + pin;
   }
}
//creating main class
public class toString_P_01 
{
    //decleration of variable
    static String name;
    static int pin;
    
    public static void main(String[] args) 
    {
        //creating SCR object
        Scanner in = new Scanner(System.in);

        //IO manipulator
        System.out.println("enter name");
        name = in.nextLine();
        System.out.println("enter pin");
        pin = in.nextInt();

        //Creating object of Student class
        student s = new student(name,pin);

        System.out.println(s);

        //all closing statements
        in.close();
    }    
}