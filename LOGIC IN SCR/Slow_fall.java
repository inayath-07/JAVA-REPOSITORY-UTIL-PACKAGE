class time_thread extends Thread
{
    

    public int i;

    public void run()
    {
       
        for(int i=10;i>0;i--)
        {
            System.out.println(i);
            try 
            {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }

       
    }
}
public class Slow_fall 
{
    public static void main(String args[])
    {
       time_thread ST = new time_thread();
        ST.start();
        if (ST.i==0)
        {
            System.out.println("hello ");

        }
    }    
}
