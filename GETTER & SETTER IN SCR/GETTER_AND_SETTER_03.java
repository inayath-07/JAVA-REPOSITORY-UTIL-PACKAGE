/*thes setter class will process int data*/
//importing packages
import java.util.*;

//creating class which contain set and get
class sum
{
    private int a,b,c;

    public void setsum(int a1,int b1)
    {
        a = a1;
        b = b1;
        
        //adding both values
        c = a+b;
    }

    public int getsum()
    {
        return c;
    }
}
public class GETTER_AND_SETTER_03
{
    //declaration of variable
    static int x;
    static int y;
    public static void main(String[] args) 
    {
        //creating SCR object
        Scanner in = new Scanner(System.in);

        //creating sum object
        sum add = new sum();
        
        //output
        System.out.println("enter 2 numbers");
        x = in.nextInt();
        y = in.nextInt();

        //passing values to setter
        add.setsum(x,y);

        System.out.println("your sum is "+add.getsum());
        //all closing statements
        in.close();
    }    
}
