/*this program is use to deal with constructor overloading  */

//importing packages
import java.io.IOException;
import java.net.Socket;
//creating class
class cons_overload
{
    public cons_overload()
    {
        System.out.println("hello from non parametarize constructor");
    }

    public cons_overload(Socket sk)
    {
        System.out.println("address of Socket is "+sk+" from 2nd constructor ");
    }
}
public class Contructors_P_05 
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("--- constructor overloading ---");
        //creating Object of Socket
        Socket S = new Socket();
        System.out.println("from main() "+S);

        //calling non parametarize constructor
        cons_overload CO = new cons_overload();
        System.out.println(CO);

        //calling parametarize constructor
        cons_overload COS = new cons_overload(S);
        System.out.println(COS);

        //all closing statement
        S.close();
    }   
}