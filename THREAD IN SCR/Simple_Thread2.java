//import java.io.*;
class Simple_Thread2 implements Runnable {
    public static void main(String args[])
    {
        // create an object of Runnable target
        Simple_Thread2 gfg = new Simple_Thread2();
  
        // pass the runnable reference to Thread
        Thread t = new Thread(gfg, "gfg");
  
        // start the thread
        t.start();
  
        // get the name of the thread
        System.out.println(t.getName());
    }
    @Override 
    public void run()
    {
        System.out.println("Inside run method");
    }
}