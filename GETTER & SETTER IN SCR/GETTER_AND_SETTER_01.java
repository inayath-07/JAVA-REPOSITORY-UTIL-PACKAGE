/*
 * Setter used to assign value to a variable 
 * Getter used to return value to a variable
 */

//importing java packages
import java.util.Scanner;

class student
{
    private String name;
    private int PIN;

    //setter 
    public void setname(String Sname)
    {
        name = Sname;        
    }

    public void setPin(int Spin)
    {
        PIN = Spin;
    }

    //getter 
    public String getname()
    {
        return name;   
    }

    public int getPin()
    {
        return PIN;
    }
}

public class GETTER_AND_SETTER_01
{
    //DECLERATION OF VARIABLE
    static String name;
    static int id;
    public static void main(String[] args) 
    {
        //creating SCR object
        Scanner in = new Scanner(System.in);
        //creating object of student
        student object = new student();

        System.out.println("enter your name");
        name = in.nextLine();

        System.out.println("enter your PIN");
        id = in.nextInt();

        System.out.println("-------------");
        object.setname(name);
        System.out.println(object.getname());

        object.setPin(id);
        System.out.println(object.getPin());

        //all closing statements
        in.close();
    }
}