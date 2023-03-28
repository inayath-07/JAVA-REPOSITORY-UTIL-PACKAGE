/* this program deal with Non - parametarize constructor */

//class declaration
class constructor
{
    public constructor()
    {
        System.out.println("hello i am  non parametarize constructor ");
    }
}

public class Contructors_P_02
{
    public static void main(String[] args) 
    {
        System.out.println("this program deal with Non - parametarize constructor");

        //creating class object
        constructor construc = new constructor();
        System.out.println(construc);
    }
}