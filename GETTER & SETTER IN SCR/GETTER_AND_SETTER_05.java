/*applying arraylist in set and get()s */
//importing packages
import java.util.ArrayList;
import java.util.Scanner;

//creating class that contain get and set()
class carclass
{
    private ArrayList<String> carl = new ArrayList<>();

    public void setcar(ArrayList<String> setcara)
    {
        carl = setcara;
    }

    public ArrayList<String> getcarList()
    {
        return carl;
    }
}

public class GETTER_AND_SETTER_05
{
    //decleration of variable 
    static int num;

    public static void main(String[] args)throws Exception
    {
        //creating SCR obj        
        Scanner in = new Scanner(System.in);

        //creating object of carclass
        carclass cc = new carclass();

        //creating ArrayList
        ArrayList<String> cal = new ArrayList<>();

        //disiplaying output
        System.out.println("enter how many numbers of cars are there");
        num = in.nextInt();

        System.out.println("enter names of car");
        for(int i=1;i<=num+1;i++)
        {
            cal.add(in.nextLine());
        }

        //using getter & setter
        cc.setcar(cal);

        System.out.println("--------------");
        for(int i = 0;i<=cal.size()-2;i++)
        {
            System.out.print(i+1+".");
            System.out.println(cc.getcarList());

            Thread.sleep(1000);
        }

        //all closing statements
        in.close();
    }
}