/*this program is use to create a thread of impliment runable */
/*best program for locking */

//importing packages
import java.util.Scanner;

class Lock implements Runnable
{
    public void run()
    {
        System.out.println("i am runnable thread ");
    }
}

public class Thread_01 
{
    public static void main(String[] args) 
    {
        //decleration of variable 
        int i,attempts;
        String pass;

        //creating object of SCR class
        try
        (Scanner in = new Scanner(System.in))
        {

            System.out.println("enter password ");

            for(i =0;i<15;i++)
            {
                pass = in.nextLine();
                if(pass.equals("hello"))
                {
                    Lock bullete = new Lock();
                    Thread gun = new Thread(bullete);

                    gun.start();

                    System.exit(0);
                    break;
                }
                //initializing attempts
                attempts = i;
                if(attempts>=5)
                {
                    System.out.println("please wait for 10  seconds ");
                    try
                    {
                        Thread.sleep(10000);
                    }catch(InterruptedException IE)
                    {
                        System.err.println("an message occured at line 46");
                    }

                    System.out.println("proceed");
                    i=1;
                }
                if(!(pass.equals("hello")))
                {
                    System.out.println("enter a correct password");
                }
            }
        }
    }    
}
