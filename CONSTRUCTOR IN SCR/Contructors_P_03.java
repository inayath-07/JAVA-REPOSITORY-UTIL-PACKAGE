/*this program deal with parametazie constructor */

//creating class
class para_cons
{
    public para_cons(String s)
    {
        System.out.println(s);
    }
}
public class Contructors_P_03 
{
    public static void main(String args[])
    {
        System.out.println("--- PARAMETARIZE CONSTRUCTOR ---");
        //creating object of class
        para_cons PC = new para_cons("hi mohammed");
        System.out.println(PC);
    }
}