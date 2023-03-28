/*it uses class student*/

//importing packages
import java.util.Scanner;

//creating class student
class student 
{
    private String name;
    private int PIN;
    private int Class;

    //creating constructor
    public student(String name, int PIN,int Class)
    {
        this.name = name;
        this.PIN = PIN;
        this.Class = Class;
    }

    //creating toString

    public String toString()
    {
        return "name is "+name+"\n"+"PIN is "+PIN +"\n"+"Class is "+Class;
    }
}
public class Constructors_P_01 
{
    public static void main(String args[])
    {
        //creating SCR object
        Scanner in = new Scanner(System.in);

        //creating Student class object
        student stu = new student("INAYATH",20,3);
        System.out.println(stu);

        //all closing statements
        in.close();
    }
}
