/*//program on basics of thread
//import java.util.*;
public class Thread
{
    public static void main(String args[]) 
    {
        Thread T = Thread.currentThread();

        System.out.println(T);

        // changing name of thread
        T.setName("hello");

        System.out.println(T);

try{
        for(int i = 0; i<10;i++)
        {
            Thread.sleep(999);
            System.out.println(i);
        }
     } catch(InterruptedException e)
     {
         System.out.println("handaling ");
     }
}
    
}
*/