/*contain practice for arraylist in integer form 
 * add()
 * remove
*/
//importing packages
import java.util.*;

public class ArrayList_P_01 
{
    public static void main(String[] args)throws Exception
    {
        //very basic use of method add
        ArrayList<Integer> ALV = new ArrayList<>();

        //let's add values in our Arraylist
        ALV.add(1);
        ALV.add(2);
        ALV.add(3);
        ALV.add(4);
        ALV.add(5);
        ALV.add(6);
        ALV.add(0,10);
        ALV.add(1,100);

        for(int i=0;i<ALV.size();i++)
        {
         System.out.println(ALV.get(i));
         Thread.sleep(1000);
        }

        System.out.println("after removed ");
        ALV.remove(0);
        for(int i=0;i<ALV.size();i++)
        {
         System.out.println(ALV.get(i));
         Thread.sleep(1000);
        }


        
    }    
}
