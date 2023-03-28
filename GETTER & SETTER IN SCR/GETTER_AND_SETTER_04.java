/*adding floating point values using set and get() */
//importing pacakages
import java.util.Scanner;
//creating class
class floating
{
    private float a;
    private float b;
    private double c;
    
    public void setfloat(float a1,float b1)
    {
        a = a1;
        b = b1;

        c = a+b;
    }

    public double getfloat()
    {
        return c;
    }
}
public class GETTER_AND_SETTER_04 
{
    //decleration og variable 
    static float x,y;
    public static void main(String[] args) 
    {
        //creating SCR object
        Scanner in = new Scanner(System.in);      
        //creating object of class sloating
        floating obj = new floating();

        //output
        System.out.println("enter two numbers in floating point");
        x = in.nextFloat();
        y = in.nextFloat();

        //passing values 
        obj.setfloat(x,y);

        //getting values
        System.out.println(obj.getfloat());
        
        //all closing statements
        in.close();
    }    
}
