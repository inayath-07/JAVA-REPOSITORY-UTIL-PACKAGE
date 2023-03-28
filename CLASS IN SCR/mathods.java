//program to create classes and methods
import java.util.*;
class class1
{
    double heigth;
    double width;
    double depth;
    double vol = heigth*depth*width;

    // creating method to call
   void volum()
    {
        System.out.println(vol);
    }
}

class methods
{
    public static void main(String args[])
    {
        //creating SCR object 
        Scanner in = new Scanner(System.in);

        //decleration of variable 
        double a,b,c;

        System.out.println("enter height width and depth");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        class1 myclass = new class1();

        myclass.depth = a;
        myclass.heigth = b;
        myclass.width = c;

        myclass.volum(); //myclass is taking values of depth heigth and width and sending those values to vloume () to perform calculation 

        // closing scanner object 
        in.close();
    }
}