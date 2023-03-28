//to do practice on class and methods
//check this program
import java.util.*;
class centigrade_scale
{
    int f;
    int c = 5/9*(f-32);

    void return_c()
    {
        System.out.println(c);
    }
}
public class class_and_methods 
{
    public static void main(String args[])    
    {
        //creating object of my class
        centigrade_scale cen = new centigrade_scale();        
        
        // creating scr object 
        Scanner in = new Scanner(System.in);

        //decleration of vaiable for centigrade scale

        System.out.println("enter temperature in fahrenhite :");
        int a = in.nextInt();
        
        //intialising values 
        cen.f = a;
        cen.return_c();

        //closing scr object 
        in.close();
    }
}

/*
import java.io.*;
class centigrade_scale
{
    int a,b,c;

    void vloume1()
{
    System.out.println(a*b*c);
}
}

public class class_and_methods
{
    public static void main(String args[]) throws IOException
    {
         //creating object of my class
         centigrade_scale cen = new centigrade_scale(); 

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("enteer a b c ");
        int k = Integer.parseInt(in.readLine());
        int l = Integer.parseInt(in.readLine());
        int m = Integer.parseInt(in.readLine());

        cen.a = k;
        cen.b = l;
        cen.c = m;

        cen.vloume1();       
    

    }
}*/


