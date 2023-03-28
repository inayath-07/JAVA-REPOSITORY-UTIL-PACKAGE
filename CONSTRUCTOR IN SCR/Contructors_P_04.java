/*this program deals with copy constructor */

//importing packages 
import java.net.InetAddress;
import java.net.UnknownHostException;

//creating class
class cpy_cons
{
    public cpy_cons(InetAddress ip)
    {
        System.out.println("the address of the object send is ");
        System.out.println(ip);

        System.out.println("------------------");

    }
}
public class Contructors_P_04 
{
    public static void main(String args[])throws UnknownHostException
    {
        System.out.println("--- copy constructor ---");
        //creating object of inetaddress
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("your IP addess is "+ip);

        System.out.println("------------------");

        //sending object IP to copy constructor
        cpy_cons CC = new cpy_cons(ip);
        System.out.println("the address of CC is "+CC);

        System.out.println("------------------");
    }
}