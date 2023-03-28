//a sample thread program by using extend thread class
class Simple_Thread extends Thread
{
    public void run()
    {
        System.out.println("السَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللهِ وَبَرَكَاتُهُ");
    }

    public static void main(String args[])
    {
        Simple_Thread ST = new Simple_Thread();

        ST.start();
    }

}