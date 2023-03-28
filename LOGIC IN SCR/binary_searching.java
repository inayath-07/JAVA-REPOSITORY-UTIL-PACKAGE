/*this program is use to search an element using binary search technique
 * this program is poort
*/

//importing packages
import java.util.Scanner;

public class binary_searching 
{
    public static void main(String args[])
    {
        //declaration of variable
        int min,size,i,j,temp;
        int FE,LE,MID,search; //elemnts in binary searching
        //creating object of SCR class 
        try
        (Scanner in = new Scanner(System.in))
        {

            //sorting of array using selection sort
            System.out.println("enter size of array");
            size = in.nextInt();

            //conditional decleration
            int array[]  = new int[size];

            System.out.println("enter array element");
            for(i=0;i<size;i++)
            {
                System.out.print((i+1)+".");
                array[i] = in.nextInt();
            }

            for(i =0;i<size;i++)
            {
                min =i;
                for(j=0;j<size;i++)
                {
                    min=j;
                }
                //arranging in sequence
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
            for(i=0;i<size;i++)
            {
                System.out.println((i+1)+"."+array[i]);
            }

            //binary searching
            System.out.println("enter number to be searched");
            search = in.nextInt();

            FE = size-size;
            LE = size;
            MID = size/2;

            if(search<array[MID])
            {
                FE = 0;
                LE = MID-1;

                MID = (FE-LE)/2;
                if(MID<0)
                {
                    MID =-(FE-LE)/2;
                }
                System.out.println("your elemnt is at first halve ");
                System.exit(0);
            }
            if(search>array[MID])
            {
                FE =MID+1;
                LE = size;

                MID = (FE-LE)/2;
                if(MID<0)
                {
                    MID =-(FE-LE)/2;
                }
                System.out.println("your elemnt is at second halve ");
                System.exit(0);
            }
            else
            {
                System.out.println("your number is not there");
            }
        }
    }
}