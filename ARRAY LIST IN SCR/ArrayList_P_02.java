/*contain practice for arraylist in string form 
*/

//importing packages
import java.util.ArrayList;
public class ArrayList_P_02 
{
    public static void main(String[] args)throws Exception
    {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Size of your ArrayList is "+al.size());        

        //adding String to arraylist
        al.add(0,"Syed");
        al.add("shah");
        al.add("Inayath");
        al.add("ullah");
        al.add("Quadri");

        //finding index number of particular object
        System.out.println("shah index no is "+al.indexOf("shah"));

        //sepration
        System.out.println("--------");

        System.out.println("Size after adding elements "+al.size());

        System.out.println("--------");

        //Displaying String
        for(int i = 0;i<=al.size()-1;i++)
        {
            System.out.println("index number of"+" "+al.get(i)+" is "+al.indexOf(al.get(i)));
            Thread.sleep(1000);
        }

        //lets remove something
        al.remove(0);

        System.out.println("--- after removal ---");
        for(int i = 0;i<=al.size()-1;i++)
        {
            System.out.println(al.get(i));
            Thread.sleep(1000);
        }
        
    }    
}